import java.io.Serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import java.io.IOException;

class X7 implements Serializable {
    private static X7 a;

    private X7() {

    }

    // lazy initialization
    public static X7 createInstance() {
        if(a == null)
            a = new X7();

        return a;
    }
}

class G {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        
        X7 a = X7.createInstance();
        X7 b = X7.createInstance();
        X7 c = X7.createInstance();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        new ObjectOutputStream(new FileOutputStream("golu.txt")).writeObject(a);
        

        X7 y = (X7)(new ObjectInputStream(new FileInputStream("golu.txt")).readObject());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(y);
    }    
}
