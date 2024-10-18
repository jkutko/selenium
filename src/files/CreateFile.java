package src.files;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) throws IOException {

        File file = new File( "src/files/test.txt");

        if (file.createNewFile()) {
            System.out.println("Stworzyłem plik");
        } else {
            System.out.println("Plik już istnieje");
        }

    }


}
