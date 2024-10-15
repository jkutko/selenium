package src;

public class MatchTeacher extends Person {

    public String school;

    public MatchTeacher(String name, int age, String  school) {
        super(name, age);
        this.school = school;
        System.out.println(" Konstruktor matchTeacher");
    }

    public void teachMtch() {
        System.out.println("I am teaching match");
    }


    // super odwołuje sie i pozwala odwołać do metody z klasy nadrzednej
    // dodatkowo rozszerza metodę
    public void walk() {
        super.walk();
        System.out.println("I am walking");
    }
}
