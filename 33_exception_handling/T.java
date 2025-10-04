import java.io.*;

class T1 {
    void pro() throws IOException {

    }
}

class T extends T1 {
    //Narrower
    void pro() throws FileNotFoundException {

    }
}
