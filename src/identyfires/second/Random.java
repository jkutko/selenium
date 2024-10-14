package src.identyfires.second;

import src.identyfires.first.Parent;

public class Random {

    public void tetIdentyf() {

        // klasa w innej paczce nie ma dostępu do pola/metody prywatnego - private, domyślnego identyfikatora oraz protected

        Parent parent = new Parent();

        System.out.println(parent.first);

        parent.firstMethod();



    }

}
