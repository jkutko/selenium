package src.drivers;

public class ChromDriver implements WebDriver {


    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę Chrom");

    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje element w przeglądarce Chrom");

    }
}
