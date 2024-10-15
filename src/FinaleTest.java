package src;

public class FinaleTest {

    public static void main(String[] args) {
//pola typu finale są nie zmienne nie można zmieić ich wartości, tworzyć nowego obiktu
        final int x = 2;

        final Person person = new Person( "Tim", 26);
        person.age = 30;
        person.name = "Ba";

    //    person = new Person( "Aga",20);

    }
}
