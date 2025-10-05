class MyThread1 extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        System.out.println(t);
    }
}

class C1 {
    public static void main(String[] args) {
        MyThread1 x = new MyThread1();
        x.setName("Golu");
        x.setPriority(8);
        x.start();

        Thread t = Thread.currentThread();

        System.out.println(t);
    }    
}
