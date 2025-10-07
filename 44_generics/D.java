class AA<Q> {

}

class D {
    public static void main(String[] args) {
        AA x = new AA(); 
        AA<String> y = new AA<String>(); 
        AA<Student> z = new AA<Student>(); 
    }
}
