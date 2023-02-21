package docs;

public class PdfDocument implements Document{
    @Override
    public void getDescription() {
        System.out.println("I am a PDF document.");
    }
}
