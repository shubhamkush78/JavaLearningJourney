import java.util.ArrayList;

class M1 {
    public static void main(String[] args) {
        ArrayList<Integer> x1 = new ArrayList<Integer>();

        x1.add(12);
        x1.add(45);
        x1.add(9);
        
        ArrayList<Float> x2 = new ArrayList<Float>();

        x2.add(1.2f);
        x2.add(4.5f);
        x2.add(9.f);

        pro(x1);
        pro(x2);
    }

    static void pro(ArrayList<Integer> list) {
        for(Integer x : list) {
            System.out.println(x);
        }
    }
    
    static void pro(ArrayList<Float> list) {
        for(Float x : list) {
            System.out.println(x);
        }
    }
}


// M1.java:27: error: name clash: pro(ArrayList<Float>) and pro(ArrayList<Integer>) have the same erasure
//     static void pro(ArrayList<Float> list) {
//                 ^
// 1 error
