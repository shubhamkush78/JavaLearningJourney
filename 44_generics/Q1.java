import java.util.ArrayList;

class Q1 {
    public static void main(String[] args) {
        
        //ok -------
        ArrayList<? extends OO> a = new ArrayList<PP>();
        
        //not ok ---------
        ArrayList<? implements OO> b = new ArrayList<QQ>();
    }
}

interface OO {   }
class PP implements OO {   }
class QQ implements OO {   }



// Q1.java:6: error: > expected
//         ArrayList<? implements OO> b = new ArrayList<QQ>();
//                     ^
// Q1.java:6: error: not a statement
//         ArrayList<? implements OO> b = new ArrayList<QQ>();
//                  ^
// 2 errors