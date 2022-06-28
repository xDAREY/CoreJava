package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFileEx1 {

    public static void main(String[] args) throws IOException {

        Path source = Paths.get("C:\\Java");

        Files.deleteIfExists(source);
    }
}
