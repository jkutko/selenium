package src.drivers.interfejs;

public enum DriverType {


    CHROME("chrome", "/src/resorces/chromdriver.exe"),
    FIREFOX ("firefox", "/src/resorces/firefox.exe");

    String name;
    String path;

    DriverType(String name, String path) {
        this.name = name;
        this.path = path;
    }



}
