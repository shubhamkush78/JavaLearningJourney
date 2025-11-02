import java.io.Serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import java.io.IOException;

class Golu implements Serializable {

}

class X8 extends Golu {
    private static X8 a;

    private X8() {
        System.out.println("#####################");
    }

    // lazy initialization
    public static X8 createInstance() {
        if(a == null)
            a = new X8();

        return a;
    }
}

class G1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        
        X8 a = X8.createInstance();
        X8 b = X8.createInstance();
        X8 c = X8.createInstance();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        new ObjectOutputStream(new FileOutputStream("golu.txt")).writeObject(a);
        

        X8 y = (X8)(new ObjectInputStream(new FileInputStream("golu.txt")).readObject());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(y);
    }    
}
