import java.util.ArrayList;

class J {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        ArrayList<Integer> y = new ArrayList();
        ArrayList z = new ArrayList<Integer>();
        
        // ----- NOT OK -----
        ArrayList<String> a = new ArrayList<Integer>();

        ArrayList<Number> b = new ArrayList<Integer>();
    }
}
