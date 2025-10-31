@FunctionalInterface
interface DDD {
    int pro();
}

// class X4 implements DD {
//     public int pro() {
//         return 78;
//     }
// }

// () -> 78;

class R {
    public static void main(String[] args) {
        DDD x = () -> 432;

        System.out.println(x.pro());
    }    
}
