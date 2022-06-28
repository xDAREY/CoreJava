package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFolderEx1 {
    public static void main(String[] args) throws IOException {
        Path search = Paths.get("C:\\Java2\\NIO\\");
        Files.createDirectory(search);
    }
}
