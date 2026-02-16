package com.mwomer.app.classes;
import java.nio.file.*;
import java.util.stream.Stream;
import java.io.IOException;
//pure utility class ; stateless
public final class FileHandler {

    //making constructor private should prevent instantiation
    private FileHandler() {
        
    }

    public static void listDirectory(String dir) {
        Path dirPath = Paths.get(dir);
        try (Stream<Path> stream = Files.list(dirPath)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}