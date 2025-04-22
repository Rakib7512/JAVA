
package classandobjectarray.students.mobile;

public class Mobile {
    
    int camera;
    String type;
    String redio;

    public Mobile() {
    }

    public Mobile(int camera, String type, String redio) {
        this.camera = camera;
        this.type = type;
        this.redio = redio;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRedio() {
        return redio;
    }

    public void setRedio(String redio) {
        this.redio = redio;
    }
    
    public void getMobileDatiles(){
    
        System.out.println("Cameira "+this.camera+"\n"+"Type "+this.type+"\n"+"Radio"+this.redio);
    }
    
}
