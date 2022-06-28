package NIO;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.EnumSet;

public class Main {
    public static void main(String[] args) throws IOException {
        String pattern = "*.txt";
        Path fileTree= Paths.get("C:\\Java");
        SearchExample walk = new SearchExample(pattern);
        EnumSet opts = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
        Files.walkFileTree(fileTree, opts, Integer.MAX_VALUE,walk);
        System.out.println("Total file found: " + walk.counter);
    }
}
