package by.goncharov.task04.service.reader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class FileReader {



    public static String read(String fileName) throws FileReaderException {
        try {
            File file = new File("src/main/resources/" + fileName);
            return new String(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            throw new FileReaderException("no file hase been found!");
        }

    }


    public static void write(String fileName, String content) throws FileReaderException {
        FileWriter writer = null;
        try {
            File file = new File("src/main/resources/" + fileName);
            writer = new FileWriter(file);
            writer.write(content);
        } catch (IOException e) {
            throw new FileReaderException("File error");
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}