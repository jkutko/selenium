package src.drivers.interfejs;

public class FirefoxDriver implements WebDriver{

    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje element w przeglądarce Firefox");
    }
}
