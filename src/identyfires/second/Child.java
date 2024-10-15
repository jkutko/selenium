package src.identyfires.second;

import src.identyfires.first.Parent;

public class Child extends Parent {

    // klasa potomna w innej paczce nie ma dostępu do pola/metody prywatnego - private oraz do domyślnego identfikatora

    public void tetIdentyfi() {
        System.out.println(first);
       // System.out.println(second); //domyślny
        System.out.println(third);

        firstMethod();
        secondMethod();
        thirdMethod();


    }
}
