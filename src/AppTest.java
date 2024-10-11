package src;

public class AppTest {

    public static void main(String[] args) {

        AndroidApp androidApp = new AndroidApp("kalkulator");
        androidApp.appInfo();
        androidApp.RunInfo();

        IphoneApp iphoneApp = new IphoneApp("zegarek");
        iphoneApp.appInfo();
        iphoneApp.RunInfo();

    }
}
