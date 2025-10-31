import java.util.ArrayList;
import java.util.function.Consumer;

// class X6 implements Consumer<String> {
//     public void accept(String next) {
//         System.out.println(next + " ~~");
//     }
// } 

// next -> System.out.println(next + " ~~");

class Y {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("chotabheem");
        a.add("jaggu");
        a.add("raju");
        a.add("chutki");
        a.add("kaliya");
        a.add("dholu");
        a.add("bholu");
        a.add("indumati");

        // Consumer<String> m = new X6();
        Consumer<String> m = next -> System.out.println(next + " ~~");;;;;;;;
        
        a.forEach(m);          
    }
}