class G {
    public static void main(String[] args) {
        Short x = new Short(23);

        System.out.println(x);
    }    
}


// G.java:3: error: no suitable constructor found for Short(int)
//         Short x = new Short(23);
//                   ^
//     constructor Short.Short(short) is not applicable
//       (argument mismatch; possible lossy conversion from int to short)
//     constructor Short.Short(String) is not applicable
//       (argument mismatch; int cannot be converted to String)
// 1 error