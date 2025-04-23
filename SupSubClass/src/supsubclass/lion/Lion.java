
package supsubclass.lion;

public class Lion {
 private int horn;
 private int legs;
  private int eyes;
  private int  tail;

    public Lion() {
    }

    public Lion(int legs, int eyes, int tail) {
        this.legs = legs;
        this.eyes = eyes;
        this.tail = tail;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Lion{" + "legs=" + legs + ", eyes=" + eyes + ", tail=" + tail + '}';
    }
   
            
   
   
}
