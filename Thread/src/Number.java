
public class Number implements Runnable{
    public int lastNum;

    public Number() {
    }

    public Number(int lastNum) {
        this.lastNum = lastNum;
    }

    @Override
    public void run() {
      for(int i=1;i<=lastNum; i++){
          System.out.println(""+lastNum);
      
      }
    }
    
    
}
