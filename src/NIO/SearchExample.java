package NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class SearchExample implements FileVisitor {
    private final PathMatcher matcher;
    int counter = 0;

    public SearchExample(String pattern){
        FileSystem fs= FileSystems.getDefault();
        matcher = fs.getPathMatcher("glob:" + pattern);
    }

    void search(Path file) throws IOException{
        Path name = file.getFileName();
        if(name != null && matcher.matches(name)){
            System.out.println("Searched file located: " + name +
                    " in " + file.getParent().toAbsolutePath());

            counter++;
        }
    }


    @Override
    public FileVisitResult preVisitDirectory(Object dir, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Object file, BasicFileAttributes attrs) throws IOException {
        search((Path) file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Object file, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Object dir, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }
}
