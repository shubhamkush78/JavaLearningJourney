class KK<Y,Z,Q> {

}

class G {
    public static void main(String[] args) {
        KK a = new KK();

        KK<Integer,String,Student> b = new KK<Integer,String,Student>();
        
        // ------ NOT OK ------------------
        KK<Integer,String,Student> c = new KK<Integer,Student,String>();  //type-safety sequence is changed...
        
        KK<Integer,String,Student> d = new KK<Integer,Student>(); //type-safety count is changed at instantiation side...

        KK<String,Student> e = new KK<Integer,String,Student>(); //type-safety count is changed at declaration side...
    }
}



// G.java:12: error: incompatible types: KK<Integer,Student,String> cannot be converted to KK<Integer,String,Student>
//         KK<Integer,String,Student> c = new KK<Integer,Student,String>();  //type-safety sequence is changed...
//                                        ^
// G.java:14: error: wrong number of type arguments; required 3
//         KK<Integer,String,Student> d = new KK<Integer,Student>(); //type-safety count is changed at instantiation side...
//                                              ^
// G.java:16: error: wrong number of type arguments; required 3
//         KK<String,Student> e = new KK<Integer,String,Student>(); //type-safety count is changed at declaration side...
//           ^
// 3 errors