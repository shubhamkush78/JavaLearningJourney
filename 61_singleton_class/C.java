// Singleton Class:
// step 1: declare all the constructors private so that no one can create an instance of singleton class X2

class X2 {
    private X2() {

    }

    private X2(int y) {

    }
}

class C {
    public static void main(String[] args) {
        X2 a = new X2();
    }    
}
