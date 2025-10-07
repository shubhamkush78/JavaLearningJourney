class JJ<G> {

}

class F1 {
    public static void main(String[] args) {
        JJ a = new JJ();
        
        JJ<boolean> b = null;
        JJ<char> c = null;
        JJ<byte> d = null;
        JJ<short> e = null;
        JJ<int> f = null;
        JJ<long> g = null;
        JJ<float> h = null;
        JJ<double> i = null;
    }    
}



// F1.java:9: error: unexpected type
//         JJ<boolean> b = null;
//            ^
//   required: reference
//   found:    boolean
// F1.java:10: error: unexpected type
//         JJ<char> c = null;
//            ^
//   required: reference
//   found:    char
// F1.java:11: error: unexpected type
//         JJ<byte> d = null;
//            ^
//   required: reference
//   found:    byte
// F1.java:12: error: unexpected type
//         JJ<short> e = null;
//            ^
//   required: reference
//   found:    short
// F1.java:13: error: unexpected type
//         JJ<int> f = null;
//            ^
//   required: reference
//   found:    int
// F1.java:14: error: unexpected type
//         JJ<long> g = null;
//            ^
//   required: reference
//   found:    long
// F1.java:15: error: unexpected type
//         JJ<float> h = null;
//            ^
//   required: reference
//   found:    float
// F1.java:16: error: unexpected type
//         JJ<double> i = null;
//            ^
//   required: reference
//   found:    double
// 8 errors
