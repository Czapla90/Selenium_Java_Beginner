public class AppTest {

    public static void main(String[] args) {

        AppAndroid android = new AppAndroid("Czapla Android", "v. 2.01", 2023, "Android");
        android.info();
        android.runAndroidApp();

        AppiOS iphone = new AppiOS("Czapla iOS", "v. 3.01", 2021, "iOS");
        iphone.info();
        iphone.runiOSApp();
    }
}
