class BThread extends Thread {
    public void run() {
        E1.info();
    }
} 

class E1 {
    public static void main(String[] args) {
        BThread x = new BThread();
        x.setName("Raju");
        x.start();

        E1.pro();
    }   
    
    static void pro() {
        Thread t = Thread.currentThread();
        for(int i=0;i<50;i++)
            System.out.println(i + " - pro - " + t.getName());
    }

    static void info() {
        Thread t = Thread.currentThread();
        for(int i=0;i<50;i++)
            System.out.println(i + " - info - " + t.getName());
    }
}
