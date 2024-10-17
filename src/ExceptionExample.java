package src;

import src.drivers.interfejs.ChromeDriver;
import src.drivers.interfejs.FirefoxDriver;
import src.drivers.interfejs.WebDriver;

public class ExceptionExample {

    public static void main(String[] args) {

/*
        int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 3;


        for (int i = 0; i< numbers.length; i++) {
            System.out.println(numbers[i]);
        }
*/


        WebDriver driver = getDriver("abc");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();


    }
    private static WebDriver getDriver(String name) {

        if(name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return  new FirefoxDriver();
        }
        return null;
    }
}
