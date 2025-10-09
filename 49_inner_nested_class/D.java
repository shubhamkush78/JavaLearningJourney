class D {
    void pro() {
        System.out.println("Hello");
    }    

    public static void main(String[] args) {
        pro();
    }
}



// D.java:7: error: non-static method pro() cannot be referenced from a static context
//         pro();
//         ^
// 1 error