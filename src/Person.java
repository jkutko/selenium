package src;

public class Person {

    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Jestem w konstruktorze Person");
    }

    public void eat() {
        System.out.println("I like pizza");
    }

    public void walk() {
        System.out.println("I like walking");
    }

    public void seyHello(){
        System.out.println("My name is " +name);
        System.out.println("I am " +age);
    }

}
