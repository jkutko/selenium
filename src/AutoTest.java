package src;

public class AutoTest {

    public static void main(String[] args) {

        Auto auto  = new Auto("marka", "model", 2000,50000);


        Auto.infoAuto();
        auto.jakiTosamochod();

        Auto auto2 = new Auto();
        auto2.marka = "Volvo";
        auto2.model = "cx";
        auto2.rok = 1999;
        auto2.przebieg = 234;
        auto2.jakiTosamochod();
        String uczelnia = auto2.nazwaUczelni;

        System.out.println(uczelnia);


    }


}
