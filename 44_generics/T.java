import java.util.ArrayList;

class T {
    public static void main(String[] args) {
        ArrayList<?> a = new ArrayList<String>();
        ArrayList<?> b = new ArrayList<Integer>();
        ArrayList<?> c = new ArrayList<KDog>();
        ArrayList<?> d = new ArrayList<Object>();
        
        ArrayList a1 = new ArrayList<String>();
        ArrayList b1 = new ArrayList<Integer>();
        ArrayList c1 = new ArrayList<KDog>();
        ArrayList d1 = new ArrayList<Object>();
        
        // ArrayList<Object> a2 = new ArrayList<String>();
        // ArrayList<Object> b2 = new ArrayList<Integer>();
        // ArrayList<Object> c2 = new ArrayList<KDog>();
        // ArrayList<Object> d2 = new ArrayList<Object>();
        
        ArrayList<? extends Object> a3 = new ArrayList<String>();
        ArrayList<? extends Object> b3 = new ArrayList<Integer>();
        ArrayList<? extends Object> c3 = new ArrayList<KDog>();
        ArrayList<? extends Object> d3 = new ArrayList<Object>();
    }    
}
