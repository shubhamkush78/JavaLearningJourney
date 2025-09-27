// final doesn't count when considering method overloading... 
// there is only one rule and that is the parameters must mismatch.

class G {
    final void pro() {
        
    }   
    
    void pro() {

    }   
}


// G.java:6: error: method pro() is already defined in class G
//     void pro() {
//          ^
// 1 error