class T {
    void pro() {
        transient int y = 90;
    }    
}



// T.java:3: error: illegal start of expression
//         transient int y = 90;
//         ^
// T.java:5: error: class, interface, enum, or record expected
// }
// ^
// 2 errors