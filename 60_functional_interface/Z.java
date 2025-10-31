import java.util.ArrayList;
import java.util.function.Consumer;

// class X6 implements Consumer<String> {
//     public void accept(String next) {
//         System.out.println(next + " ~~");
//     }
// } 

// next -> System.out.println(next + " ~~");

class Z {
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
        a.add("indraverma");

        // Consumer<String> m = new X6();
        // Consumer<String> m = next -> System.out.println(next + " ~~");;;;;;;;
        
        a.forEach(next -> System.out.println(next + " ~~"));          
    }
}