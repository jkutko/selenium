package src.drivers.interfejs;

public class ChromeDriver implements WebDriver {


    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę Chrom");

    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje element w przeglądarce Chrom");

    }
}
