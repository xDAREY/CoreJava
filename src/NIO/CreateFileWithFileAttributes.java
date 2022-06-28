package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class CreateFileWithFileAttributes {

    public static void main(String[] args) throws IOException {
        Path search = Paths.get("C:\\Java\\Input3.txt");
        Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-rw-rw-");

        FileAttribute<Set<PosixFilePermission>> attr
                = PosixFilePermissions.asFileAttribute(perms);

        Files.createFile(search, attr);
    }
}
