package src;

public class Footbollaler extends Person {

    public String footballClub;

    public Footbollaler(String name, int age, String footballClub) {
        super(name, age);
        this.footballClub = footballClub;
        System.out.println("Jestem w fotbooler");

    }

    public void eat() {
        System.out.println("I like healthy food");
    }


    public void playFootbal() {
        System.out.println("I am playing football " +footballClub);
    }

}
