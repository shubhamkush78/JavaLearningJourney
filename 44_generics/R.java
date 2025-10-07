import java.util.ArrayList;

class R {
    public static void main(String[] args) {
        ArrayList<? super Dog> a = new ArrayList<Dog>();
        ArrayList<? super Dog> b = new ArrayList<Animal>();
        ArrayList<? super Dog> c = new ArrayList<LivingBeing>();
        ArrayList<? super Dog> d = new ArrayList<Object>();

        // ArrayList<? super Dog> e = new ArrayList<BDog>();   // Not Ok
        // ArrayList<? super Dog> f = new ArrayList<Human>();   // Not Ok
    }    
}


// R.java:10: error: incompatible types: ArrayList<BDog> cannot be converted to ArrayList<? super Dog>
//         ArrayList<? super Dog> e = new ArrayList<BDog>();
//                                    ^
// 1 error
