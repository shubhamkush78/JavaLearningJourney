import java.util.Scanner;

class Circle {
    static Scanner sc = new Scanner(System.in);
    private int radius;

    synchronized void readRadius() {
        Thread t = Thread.currentThread();

        if(radius != 0) {
            System.out.println(t.getName() + " - The radius read: " + radius);
            radius = 0;
            notify();
        } else {
            try { wait(); } catch(InterruptedException e) { e.printStackTrace(); }
        }
        return ;
    }

    synchronized void writeRadius() {
        Thread t = Thread.currentThread();

        if(radius == 0) {
            System.out.print(t.getName() + " - Enter radius: ");
            this.radius = sc.nextInt();
            notify();
        } else {
            try { wait(); } catch(InterruptedException e) { e.printStackTrace(); }
        }
    }
}

class U {
    static Circle c = new Circle();

    public static void main(String[] args) {
        Thread t1 = new Thread(new C1Runnable(), "Producer");
        Thread t2 = new Thread(new C2Runnable(), "Consumer");
        
        t1.start();
        t2.start();
    }
}

class C1Runnable implements Runnable {
    public void run() {
        while(true)
            U.c.writeRadius();
    }
}

class C2Runnable implements Runnable {
    public void run() {
        while(true)
            U.c.readRadius();
    }
}
