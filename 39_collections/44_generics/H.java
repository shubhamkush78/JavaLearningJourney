class LL<Y,Z,Q> {

}

class H {
    public static void main(String[] args) {

        LL<String,Student> a = new LL<String,Student>();
        
        LL<Integer,String,Student> b = new LL<Integer,String,Student>();
    }
}


// H.java:8: error: wrong number of type arguments; required 3
//         LL<String,Student> a = new LL<String,Student>();
//           ^
// H.java:8: error: wrong number of type arguments; required 3
//         LL<String,Student> a = new LL<String,Student>();
//                                      ^
// 2 errors