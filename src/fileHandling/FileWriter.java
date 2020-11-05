package fileHandling;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileWriter {
    public String writeFile(String announcedStudent, String filePath) {
        String filledStudent = null;
        Path path = Paths.get(filePath);
        String student = System.lineSeparator() + announcedStudent;


            try {
                Files.write(path, student.getBytes(), StandardOpenOption.APPEND);
                filledStudent = announcedStudent;
            } catch (IOException e) {
                System.err.println(e);
            }
            return filledStudent;

    }
}
