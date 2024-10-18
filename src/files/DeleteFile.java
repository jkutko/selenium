package src.files;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        File file = new File("src/files/test.txt");

        if (file.delete()){
            System.out.println("Usuwamy");
        } else {
            System.out.println("Nie udało się");
        }

    }
}
