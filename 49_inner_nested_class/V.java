class V {
    int k = 900;
    class X extends CCC {        
        void pro() {            
            System.out.println(k);
        }
    }   
    
    public static void main(String[] args) {
        X x = new V().new X();

        x.pro();
    }
}

class CCC {
    int k = 7777;
}