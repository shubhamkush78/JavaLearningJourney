class R {

}

class E {
    public static void main(String[] args) {
        E e = new E();

        System.out.println(e instanceof Object);
        System.out.println(e instanceof R);
    }    
}



// E.java:10: error: incompatible types: E cannot be converted to R
//         System.out.println(e instanceof R);
//                            ^
// 1 error