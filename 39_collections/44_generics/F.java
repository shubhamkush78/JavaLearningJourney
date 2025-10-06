class EE<Y> {

}

class F {
    public static void main(String[] args) {
        EE a = null; 
        EE<FF> b = null; 
        EE<FF.AA> c = null; 
        EE<GG> d = null; 
        EE<HH> e = null; 
        EE<II> f = null; 
        EE<int[]> g = null; 
    }    
}


class FF { 
    class AA {

    }
}

abstract class GG { }

interface HH { }

enum II { }