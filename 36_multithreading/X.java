class X  {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        
        t.setPriority(MAX_PRIORITY);
    }    
}


// X.java:5: error: cannot find symbol
//         t.setPriority(MAX_PRIORITY);
//                       ^
//   symbol:   variable MAX_PRIORITY
//   location: class X
// 1 error