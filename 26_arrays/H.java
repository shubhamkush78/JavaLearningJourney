class H {
    public static void main(String[] args) {
        Y[] x = new Y[3];

        x[0] = new AA();
        x[1] = new BB();
        x[2] = new CC();
    }    
}

interface Y { }

class AA implements Y { }
class BB implements Y { }
class CC implements Y { }