package src;

public class PersonTest {

    public static void main(String[] args) {
        MatchTeacher teacher = new MatchTeacher("Tom", 30, "AGH");
        teacher.walk();
        teacher.eat();
        teacher.seyHello();
        teacher.teachMtch();


        Footbollaler footbollaler = new Footbollaler("Mike", 12, "Klub");
        footbollaler.seyHello();
        footbollaler.eat();
        footbollaler.walk();
        footbollaler.playFootbal();

    }
}
