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

}
