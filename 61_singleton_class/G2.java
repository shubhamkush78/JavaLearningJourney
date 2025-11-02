import java.io.Serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import java.io.IOException;

class Bablu implements Serializable {

}

class X9 extends Bablu {
    private static X9 a;

    private X9() {
        System.out.println("#####################");
    }

    protected Object readResolve() {
        return a;
    }

    // lazy initialization
    public static X9 createInstance() {
        if(a == null)
            a = new X9();

        return a;
    }
}

class G2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {        
        
        X9 a = X9.createInstance();
        X9 b = X9.createInstance();
        X9 c = X9.createInstance();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        new ObjectOutputStream(new FileOutputStream("golu.txt")).writeObject(a);
        

        X9 y = (X9)(new ObjectInputStream(new FileInputStream("golu.txt")).readObject());

        System.out.println("~~~~~~~~~~~******~~~~~~~~~~~~~~~~");
        System.out.println(y);
    }    
}
