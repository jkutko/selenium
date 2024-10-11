package src;

public class Auto {

    public String marka;
    public String model;
    public Integer rok;
    public Integer przebieg;

    public static String nazwaUczelni = "AGH";

    public Auto(){

    }

    public Auto (String marka, String model, int rok, int przebieg){
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;

    }

    public void jakiTosamochod(){
        System.out.println("Jaki to samochód " +marka +" " +model +" " +rok +" " +przebieg);

    }

    public static void infoAuto() {
        System.out.println("Moje auto to jest jakie jest");
        druga();

    }

    public static void druga() {
        System.out.println("Jestem druga");
    }

}
