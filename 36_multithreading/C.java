class MyThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        System.out.println(t);
    }
}

class C {
    public static void main(String[] args) {
        MyThread x = new MyThread();
        x.start();

        Thread t = Thread.currentThread();

        System.out.println(t);
    }    
}
