
public class Char implements Runnable{
    private char charToPrint;
    private int times;

    public Char() {
    }

    public Char(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }

    @Override
    public void run() {
        for(int i= 1; i<=times; i++){
            System.out.println(""+charToPrint);
        
        }
    }
    
}
