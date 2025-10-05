class D {
    void pro() {
        try {
            // throw new Error();

            throw new Exception();

            // throw new IOException();

            // throw new ArithmeticException();

            // throw new RuntimeException();

            // throw new IOError(new NullPointerException());
        } catch(Object e) {

        }
    }    
}


// D.java:15: error: incompatible types: Object cannot be converted to Throwable
//         } catch(Object e) {
//                 ^
// 1 error