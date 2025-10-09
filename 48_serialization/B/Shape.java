import java.io.Serializable;

class Shape implements Serializable {
    int length;    
    int width;    
    int height;

    public Shape(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }
}
