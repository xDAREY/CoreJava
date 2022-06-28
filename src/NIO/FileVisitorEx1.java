package NIO;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorEx1 implements FileVisitor <Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("About to Visit " + dir );
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Currently Visiting " + file );
        System.out.println("Is this file a directory: " + Files.isDirectory(file));
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println(exc.getMessage());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Just Visited " + dir );
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        Path run = Paths.get("C:\\Java2");
        FileVisitorEx1 file = new FileVisitorEx1();
        Files.walkFileTree(run, file);
    }
}
