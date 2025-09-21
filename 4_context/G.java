class G {

    void info() {
        System.out.println("jay kumar");
    }

    void pro() {
        G.info();
    }

    public static void main(String[] args) {
        G x = new G();
        x.pro();
    }
}

// G.java:8: error: non-static method info() 
// cannot be referenced from a static context
//         G.info();
//          ^
// 1 error
