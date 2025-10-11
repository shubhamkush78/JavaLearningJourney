class A {
    public static void main(String[] args) {
        try {
            Class klass = Class.forName("X1");  
            
            System.out.println(klass);
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class X1 {

}