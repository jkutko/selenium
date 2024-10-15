package src.identyfires.first;

public class Child extends Parent {

    public void tetIdentyf() {

        // klasa potomna w tej samej paczce nie ma dostępu do pola/metody prywatnego - private

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
       // System.out.println(fourth);
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();


    }

}
