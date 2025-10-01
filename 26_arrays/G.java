class G {
    public static void main(String[] args) {
        Y[] x = new Y[3];

        x = new AA[3];
        x = new BB[3];
        x = new CC[3];

        System.out.println(x);
    }    
}

interface Y { }

class AA implements Y { }
class BB implements Y { }
class CC implements Y { }