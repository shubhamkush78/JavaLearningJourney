import java.io.*;

class Z {
    void pro() throws FileNotFoundException, IOException  {
         
    }    
}

// Vs.

class Z1 {
    void pro()  {
        try {

        } catch(FileNotFoundException|IOException e) {
            
        } 
    }    
}