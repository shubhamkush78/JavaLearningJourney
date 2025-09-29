
class T3 {
    T3(int x) {
        System.out.println(1);
    }
}

class M3 extends T3 {
    M3() {
        super(8);
    }

    public static void main(String[] args) {
        System.out.println(5);
        //M3 a = new M3();
        System.out.println(9);
    }
}