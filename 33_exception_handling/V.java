class V1 {
    void pro() throws NullPointerException {

    }
}

// No Rules: Unchecked
class V extends V1 {
    void pro() throws RuntimeException {

    }
}
