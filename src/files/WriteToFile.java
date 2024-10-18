package src.files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("src/files/test.txt");
        writer.write( "\n Some text ");
        writer.close();


    }


}
