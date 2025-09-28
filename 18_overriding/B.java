class X2 {
    void pro() {

    }
}

class B extends X2 {
    //class B has two overloaded versions of method pro: 
    // one is no parameterized (inherited from it's parent)
    // and the other is one-parameterized
    // parameter body mmismatched...
    // A perfect case of method overloading ...
    void pro(int y) {

    }
}
