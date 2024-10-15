package src.drivers;

public class WebDriverTest {

    public static void main(String[] args) {

        ChromDriver chrom = new ChromDriver();
        chrom.get();
        chrom.findElementBy();


        FirefoxDriver firefox = new FirefoxDriver();
        firefox.get();
        firefox.findElementBy();
    }

}
