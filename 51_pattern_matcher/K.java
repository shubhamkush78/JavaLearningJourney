// \d -	A digit: [0-9]

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class K {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\d");
    }
}



// K.java:6: error: illegal escape character
//         Pattern p = Pattern.compile("\d");
//                                       ^
// 1 error