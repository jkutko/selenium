package src;

import src.drivers.interfejs.FirefoxDriver;
import src.drivers.interfejs.WebDriver;

public class ConversionCasting {


    public static void main(String[] args) {
        int a = 2;
        double b = 4.23;


        double c = a/b; // a zostaje przekonwertowana na double 2.00

        // jak wymusić by mieć int

        int d = a/(int) b;

        System.out.println(c);
        System.out.println(d);


        WebDriver driver = new FirefoxDriver();

        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;
        firefoxDriver.get();


    }

}
