class F {
    public static void main(String[] args) {
        G.pro();
    }
}

class G {
    void pro() {
        System.out.println("Namaste");
    }
}


// F.java:3: error: non-static method pro() cannot be referenced from a static context
//         G.pro();
//          ^
// 1 error