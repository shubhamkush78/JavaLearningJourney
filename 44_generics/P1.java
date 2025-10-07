import java.util.ArrayList;

class P1 {
    public static void main(String[] args) {
        ArrayList<? extends Number> x1 = new ArrayList<Byte>();
        ArrayList<? extends Number> x2 = new ArrayList<Short>();
        ArrayList<? extends Number> x3 = new ArrayList<Integer>();
        ArrayList<? extends Number> x4 = new ArrayList<Long>();
        ArrayList<? extends Number> x5 = new ArrayList<Float>();
        ArrayList<? extends Number> x6 = new ArrayList<Double>();
        ArrayList<? extends Number> x7 = new ArrayList<Number>();
        ArrayList<? extends Number> x8 = new ArrayList<Object>();
        ArrayList<? extends Number> x9 = new ArrayList<String>();
    }    
}


// P1.java:12: error: incompatible types: ArrayList<Object> cannot be converted to ArrayList<? extends Number>
//         ArrayList<? extends Number> x8 = new ArrayList<Object>();
//                                          ^
// P1.java:13: error: incompatible types: ArrayList<String> cannot be converted to ArrayList<? extends Number>
//         ArrayList<? extends Number> x9 = new ArrayList<String>();
//                                          ^
// 2 errors
