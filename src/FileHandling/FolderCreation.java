package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FolderCreation {
    public static void main(String[] args) throws IOException {
        FileWriter writer  = new FileWriter("demo.txt");
        writer.write("Hi, I am Aryan Raj. A Java Backend Developer");
        writer.write(" and a Cloud Engineer...");
        writer.close();

        FileReader reader = new FileReader("demo.txt");
        int ch;

        while((ch = reader.read()) != -1){
            System.out.print((char) ch);
        }

        reader.close();
    }
}
