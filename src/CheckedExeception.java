package src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.SortedMap;

public class CheckedExeception {

/* pierwszy sposób rzucanie wyjątku - każda metoda musi mieć wtedy dodanie throws

    public static void main(String[] args) throws FileNotFoundException {
        readFile("/src/abc.txt");
    }


   public static void readFile(String path) throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(path);

    }
*/

    public static void main(String[] args)  {

        try {
            System.out.println("Przed przeczytaniem jakiś kod");
            readFile("D:\\p1_REPO\\selenium\\src\\testt.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Leci wyjątek");
            System.out.println(e.getMessage());
            // throw new RuntimeException(e);
            // e.printStackTrace();

        } finally {
            System.out.println("Po pliku zamykamy");

        }
    }


    public static void readFile(String path) throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(path);

    }



}
