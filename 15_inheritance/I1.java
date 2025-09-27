// Multiple Inheritance...

class XX {  
    void pro() {
        System.out.println("Hi");
    }
}

interface YY { 
    void info();
}

class I1 extends XX implements YY{
    public void info() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        I1 x = new I1();

        x.pro();
        x.info();
    }
}


// Java supports multiple inheritance...