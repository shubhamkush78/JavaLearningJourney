import java.io.*;

class P1 {
    void pro() throws EOFException {

    }
}

class P extends P1 {
    //Wider
    void pro() throws IOException {

    }
}



// P.java:11: error: pro() in P cannot override pro() in P1
//     void pro() throws IOException {
//          ^
//   overridden method does not throw IOException
// 1 error