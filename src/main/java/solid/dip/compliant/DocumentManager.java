package solid.dip.compliant;

public class DocumentManager {
    
    private String text;
    private Printer p;

    public DocumentManager(String txt){
        this.text = txt;
        this.p = new Printer();
    }

    public void addText(String txt){
        this.text += txt;
    }

    public void printDocument(){
        p.print(text);
    }

}
