class AThread extends Thread {
    public void run() {
        D.pro();
    }
} 

class D {
    public static void main(String[] args) {
        AThread x = new AThread();
        x.setName("ChotaBheem");
        x.start();

        D.pro();
    }   
    
    static void pro() {
        Thread t = Thread.currentThread();

        System.out.println(t);
    }
}
