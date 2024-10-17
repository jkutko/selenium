package src.drivers.interfejs;

public class WebDriverTest {

    public static void main(String[] args) throws Exception {

        WebDriver driver = getDriver("chromee");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();


        /*FirefoxDriver firefox = new FirefoxDriver();
        firefox.get();
        firefox.findElementBy();
        firefox.findElementBy();
        firefox.findElementBy();
        firefox.findElementBy();
        firefox.findElementBy();
        firefox.findElementBy();*/
    }

    private static WebDriver getDriver(String name) throws Exception {

        if(name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return  new FirefoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name");
    }

}
