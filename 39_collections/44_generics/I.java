import java.util.ArrayList;

class I {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();

        ArrayList b = new ArrayList<Integer>();
        
        ArrayList<Integer> c = new ArrayList();
        
        ArrayList<Integer> d = new ArrayList<>();
        ArrayList b1 = new ArrayList<>();

        //not ok
        // ArrayList<> b2 = new ArrayList<Integer>();
    }    
}
