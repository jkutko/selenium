package src.lambda;

public class StudentTest {

    public static void main(String[] args) {

    Student it = new ItStudent();

    sayHello("John", it, 21);


    Student med = new Student() {
        @Override
        public void sayHello(String name, int age) {
            System.out.println("I will be a doctor");
            System.out.println("My name is " +name);
        }
   };

    sayHello("Kasia", med, 34);


    // LAMBDA
    // (parametr/ry) -> System.out.println("I am not a student. My name is " +name);

        Student noStu = (name, age) -> {
            System.out.println("I am not a student. My name is " + name + " i am " + age);

        if (age>18){
            System.out.println("I can buy beer");
        }

        };
        sayHello("Tom",noStu,20);

    Student dzecko = ((name, age) -> System.out.println("I am a child. My name is " +name +" I am " +age ));
    sayHello("dziecko Basia",dzecko, 10);


    }

    public static void sayHello( String name, Student student, int age) {
        student.sayHello(name, age);

    }

}
