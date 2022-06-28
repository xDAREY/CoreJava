package NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        Path search = Paths.get("C:\\Java\\Input.txt");


        // getFileName method:- is used to get the name of the file
        // with the extension

        System.out.println(search.getFileName());
        System.out.println(search.getFileSystem());
        System.out.println(search.getName(0));
        System.out.println(search.getParent());
        System.out.println(search.getRoot());
    }
}
