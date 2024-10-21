package src.drivers.interfejs;

public class WebDriverSecondTest {

    public static void main(String[] args) {

        WebDriver chrom = new ChromeDriver();
        WebDriver secondChrom = new ChromeDriver();


        WebDriver firefox = new FirefoxDriver();
        WebDriver firefoxSecond = new FirefoxDriver();
        WebDriver firefoxThird = new FirefoxDriver();


        WebDriver safari = new WebDriver() { //klasa anonimowa
            @Override
            public void get() {
                System.out.println("Opening page by safari");
            }

            @Override
            public void findElementBy() {
                System.out.println("Find by safari");
            }
        };

        safari.get();
        safari.findElementBy();

    }

}
