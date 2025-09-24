import java.util.Date;
import java.sql.Date;

class J {
    public static void main(String[] args) {
        Date date = new Date();
        Date dt = new Date(12121L);
    }    
}




// J.java:2: error: a type with the same simple name is already defined by the single-type-import of Date
// import java.sql.Date;
// ^
// J.java:6: error: reference to Date is ambiguous
//         Date date = new Date();
//         ^
//   both class java.util.Date in java.util and class java.sql.Date in java.sql match
// J.java:6: error: reference to Date is ambiguous
//         Date date = new Date();
//                         ^
//   both class java.util.Date in java.util and class java.sql.Date in java.sql match
// J.java:7: error: reference to Date is ambiguous
//         Date dt = new Date(12121L);
//         ^
//   both class java.util.Date in java.util and class java.sql.Date in java.sql match
// J.java:7: error: reference to Date is ambiguous
//         Date dt = new Date(12121L);
//                       ^
//   both class java.util.Date in java.util and class java.sql.Date in java.sql match
// 5 errors
