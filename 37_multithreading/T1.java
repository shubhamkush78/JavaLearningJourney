import java.util.Date;

class T1 {
    public static void main(String[] args) {
        
        long a = new Date().getTime();
        pro();
        info();
        long b = new Date().getTime();

        System.out.println(b - a);
    }

    static void pro() {
        Thread t = Thread.currentThread();

        for(int i=0;i<30;i++) {
            System.out.println(i + " - " + t.getName()); 
            try { Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace(); } 
        }
    }
        
    static void info() {
        Thread t = Thread.currentThread();

        for(int i=0;i<30;i++) {
            System.out.println(i + " - " + t.getName()); 
            try { Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace(); } 
        }
    }
}