package java11.feature;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewFileMethod {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("abc.txt");
           // System.out.println(path.toAbsolutePath());
            String data = Files.readString(path);
            System.out.println(data);

            Path path1 = Paths.get("xyz.txt");
            path1 = Files.writeString(path1, "Welcome to studytonight!!");
            String data1 = Files.readString(path1);
            System.out.println(data1);
            }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
