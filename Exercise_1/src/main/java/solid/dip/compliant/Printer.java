package solid.dip.compliant;

public class Printer implements IPrinterService{

    @Override
    public void print(String text){
        System.out.println(text);
    }
    
}
