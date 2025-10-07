import java.util.ArrayList;

class Q {
    public static void main(String[] args) {
        ArrayList<DD> a = new ArrayList<MM>();
        ArrayList<DD> b = new ArrayList<NN>();
    }
}

interface DD {   }
class MM implements DD {   }
class NN implements DD {   }


// Q.java:5: error: incompatible types: ArrayList<MM> cannot be converted to ArrayList<DD>
//         ArrayList<DD> a = new ArrayList<MM>();
//                           ^
// Q.java:6: error: incompatible types: ArrayList<NN> cannot be converted to ArrayList<DD>
//         ArrayList<DD> b = new ArrayList<NN>();
//                           ^
// 2 errors