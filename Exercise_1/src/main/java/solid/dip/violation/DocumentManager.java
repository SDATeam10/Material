package solid.dip.violation;


public class DocumentManager {

    private String text;
    private PrinterService pService;

    public DocumentManager(String text) {
        this.text = text;
        pService = new PrinterService();
    }

    public void addText(String text) {
        this.text += text;
    }

    public void printDocument() {
        pService.print(text);
    }

  
}
