class I1Thread extends Thread {
    public void run() throws InterruptedException {
        Thread t = Thread.currentThread();        
        for(int i=0;i<30;i++) {
            System.out.println(i + " - " + t.getName());
            // try { Thread.sleep(20); } catch(InterruptedException e) { e.printStackTrace(); }   
            Thread.sleep(20);              
        }
    }
}

class M1 {
    public static void main(String[] args)  {
        I1Thread t = new I1Thread();
        t.setName("Yam");
        t.start();
        Thread x = Thread.currentThread();        
        for(int i=0;i<30;i++) {
            System.out.println(i + " - " + x.getName());
            // try { Thread.sleep(20); } catch(InterruptedException e) { e.printStackTrace(); }               
        }
    }    
}



// M1.java:2: error: run() in I1Thread cannot implement run() in Runnable
//     public void run() throws InterruptedException {
//                 ^
//   overridden method does not throw InterruptedException
// 1 error