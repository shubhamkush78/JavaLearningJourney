import java.io.*;

class Q1 {
    void pro() {

    }
}

class Q extends Q1 {
    //Newer
    void pro() throws IOException {

    }
}


// Q.java:11: error: pro() in Q cannot override pro() in Q1
//     void pro() throws IOException {
//          ^
//   overridden method does not throw IOException
// 1 error