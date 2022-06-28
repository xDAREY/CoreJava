package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class CopyFilesEx1 {

    public static void main(String[] args) throws IOException {

        Path source = Paths.get("C:\\Java\\Input.txt");
        Path target  = Paths.get("C:\\Java2\\NIO\\Input.txt");

        Files.copy(source,target,REPLACE_EXISTING,COPY_ATTRIBUTES);
    }
}
