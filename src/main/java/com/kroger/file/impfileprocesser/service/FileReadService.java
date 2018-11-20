package com.kroger.file.impfileprocesser.service;

import com.kroger.file.impfileprocesser.task.ScheduledTasks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class FileReadService {

    private static final Logger logger = LoggerFactory.getLogger(FileReadService.class);

    @Value("${file.source.path}")
    private String sourcePath;


    @Value("${file.destination.path}")
    private String destinationPath;

    private List<String> sourceFileNames;

    public List<String> readFileNamesFromSource() {
        sourceFileNames = new ArrayList<>();
        try (Stream<Path> paths = Files.walk(Paths.get(sourcePath))) {
            sourceFileNames = paths.filter(Files::isRegularFile)
                    .map(s -> s.getFileName().toString())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            // TODO: If Error Occurs, redirect to destination path
            e.printStackTrace();
        }
        return sourceFileNames;
    }

    public void moveFilesToDestination() {
        logger.info("Files From Source :: {}", sourceFileNames);
        getFileNamesFromDB();
        sourceFileNames.forEach(fileName -> writeIntoDestinationFolder(fileName));
        saveRecentFileNamesToDB(sourceFileNames);
    }


    private void getFileNamesFromDB() {
        // TODO:
        // Connect to DB and get existing processed file names
        List<String> fileNamesFromDB = new ArrayList<>();
        fileNamesFromDB.add("000000001.json");
        fileNamesFromDB.add("000000002.json");
        checkFileExists(fileNamesFromDB);
    }

    private List<String> checkFileExists(final List<String> fileNamesFromDB) {
        sourceFileNames.removeAll(fileNamesFromDB);
        logger.info("Files After remove: {} ", sourceFileNames);
        return sourceFileNames;
    }

    private void writeIntoDestinationFolder(final String fileName) {
        String filePath = sourcePath + fileName;
        try {
            Thread.sleep(3000);
            byte[] jsonData = Files.readAllBytes(Paths.get(filePath));
            try (FileOutputStream fos = new FileOutputStream(destinationPath + fileName)) {
                fos.write(jsonData);
            }
        } catch (Exception e) {
            // TODO : If exception occur , need to move that file to error folder
            e.printStackTrace();
        }
    }

    private void saveRecentFileNamesToDB(List<String> sourceFileNames) {
        // TODO: Connect to DB
        // Save recently processed file names into DB
    }

}
