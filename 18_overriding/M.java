class B1 {
    final void pro() {

    }
}

class M extends B1 {
    void pro() {
        
    }
}



// M.java:8: error: pro() in M cannot override pro() in B1
//     void pro() {
//          ^
//   overridden method is final
// 1 error