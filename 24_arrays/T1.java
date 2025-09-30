class T1 {
    public static void main(String[] args) {
        Animal[] x = new Dog[2];

        x[0] = new Dog();
        x[1] = new Cat();

        System.out.println(x[0]);
        System.out.println(x[1]);
    }    
}


// Exception in thread "main" java.lang.ArrayStoreException: Cat
//         at T1.main(T1.java:6)