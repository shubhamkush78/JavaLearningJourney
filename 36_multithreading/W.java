class W {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        
        t.setPriority(11);
    }    
}

// Priority Range: 1-10

// Exception in thread "main" java.lang.IllegalArgumentException
//         at java.base/java.lang.Thread.setPriority(Thread.java:1149)
//         at W.main(W.java:5)
