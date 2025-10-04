class W1 {
    void pro() throws NullPointerException {

    }
}

// No Rules: Unchecked
class W extends W1 {
    void pro() throws ClassCastException {

    }
}
