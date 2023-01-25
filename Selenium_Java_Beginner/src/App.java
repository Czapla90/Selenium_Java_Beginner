//Stwórz klasę bazową App - zawiera pole name i metodę appInfo.
//Dodaj konstrkutor do którego przekażesz wartość name.
//Stwórz klasy potomne AndroidApp i iPhone App - zawierające metodę runAdroidApp / run iPhoneApp.

public class App {

    public String name;
    public String version;
    public int yearReleased;

    public App(String name, String version, int yearReleased) {
        this.name = name;
        this.version = version;
        this.yearReleased = yearReleased;
    }

    public void info() {
        System.out.println("The " + name + " App has been released in " + yearReleased);
        System.out.println("Current version: " + version);
    }
}
