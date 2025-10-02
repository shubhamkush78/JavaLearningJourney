class E {
    public static void main(String[] args) {
        Byte x = new Byte(34);

        System.out.println(x);
    }
}



// E.java:3: error: no suitable constructor found for Byte(int)
//         Byte x = new Byte(34);
//                  ^
//     constructor Byte.Byte(byte) is not applicable
//       (argument mismatch; possible lossy conversion from int to byte)
//     constructor Byte.Byte(String) is not applicable
//       (argument mismatch; int cannot be converted to String)
// 1 error