package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.*;

public class Introduction {
    public static void main(String[] args) throws IOException {
        //Using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a message");
        String message = reader.readLine();
        System.out.println(message);

        //Using PrintWriter
        PrintWriter writer = new PrintWriter(System.out,true);
        writer.println("hi");

    }
}
