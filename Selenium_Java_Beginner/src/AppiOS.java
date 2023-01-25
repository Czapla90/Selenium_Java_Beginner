public class AppiOS extends App{

    public String operatingSystem;

    public AppiOS(String name, String version, int yearReleased, String operatingSystem) {
        super(name, version, yearReleased);
        this.operatingSystem = operatingSystem;
    }

    public void runiOSApp() {
        System.out.println("This App is running on " + operatingSystem);
    }
}
