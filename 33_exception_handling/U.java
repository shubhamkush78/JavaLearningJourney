import java.io.*;

class U1 {
    void pro() throws IOException {

    }
}

class U extends U1 {
    //Narrower
    void pro() throws FileNotFoundException, EOFException {

    }
}
