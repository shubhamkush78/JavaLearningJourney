class S1 {
    public static void main(String[] args) {
        LivingBeing x = new Cat();

        Animal[] a = new Animal[1];

        a[0] = x;
    }    
}


// S1.java:7: error: incompatible types: LivingBeing cannot be converted to Animal
//         a[0] = x;
//                ^
// 1 error