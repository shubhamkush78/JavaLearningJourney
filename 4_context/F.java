class F {
    void pro() {
        System.out.println("Jay kumar");
    }

    public static void main(String[] args) {
        F.pro();
    }
}

// F.java:7: error: non-static method pro() 
// cannot be referenced from a static context
//         F.pro();
//          ^
// 1 error