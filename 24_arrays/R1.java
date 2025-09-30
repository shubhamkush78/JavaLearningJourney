class R1 {
    public static void main(String[] args) {
        LivingBeing x = new Cat();


        Animal y = x;
    }    
}


// R1.java:6: error: incompatible types: LivingBeing cannot be converted to Animal
//         Animal y = x;
//                    ^
// 1 error
