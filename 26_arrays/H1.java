class H1 {
    public static void main(String[] args) {
        Y[] x = {new AA(), new BB(), new CC()};

        System.out.println(x);
    }    
}

interface Y { }

class AA implements Y { }
class BB implements Y { }
class CC implements Y { }