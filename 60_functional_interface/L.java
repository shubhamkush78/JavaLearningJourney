@FunctionalInterface
interface AAA {
    void pro();
}

// class X1 implements AAA {
//     public void pro() {
//         System.out.println("Namaste Ji");
//     }
// }

// () ->  System.out.println("Namaste Ji");


class L {
    public static void main(String[] args) {
        AAA x = () ->  System.out.println("kemcho Ji");

        x.pro();
    }    
}