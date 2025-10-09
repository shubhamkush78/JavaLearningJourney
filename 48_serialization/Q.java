class Q {
    transient void pro() {

    }   
    
    transient static void info() {

    }
}


// Q.java:2: error: modifier transient not allowed here
//     transient void pro() {
//                    ^
// Q.java:6: error: modifier transient not allowed here
//     transient static void info() {
//                           ^
// 2 errors