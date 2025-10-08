import java.io.File;

class C {
    public static void main(String[] args) {
        File file = new File("D:\doraemon\nobita.pdf"); // absolute path ...
        
        System.out.println(file);
    }
}


// C.java:5: error: illegal escape character
//         File file = new File("D:\doraemon\nobita.pdf");
//                                  ^
// 1 error