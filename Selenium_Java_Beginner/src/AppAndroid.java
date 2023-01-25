public class AppAndroid extends App {

    public String operatingSystem;

    public AppAndroid(String name, String version, int yearReleased, String operatingSystem) {
        super(name, version, yearReleased);
        this.operatingSystem = operatingSystem;
    }


    public void runAndroidApp() {
        System.out.println("This app is running on " + operatingSystem);
    }
}
