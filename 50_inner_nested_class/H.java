class AA {
    static class BB {

    }
}

class H {
    public static void main(String[] args) {
        AA.BB x = new BB(); 
    }    
}


// H.java:9: error: cannot find symbol
//         AA.BB x = new BB();
//                       ^
//   symbol:   class BB
//   location: class H
// 1 error
