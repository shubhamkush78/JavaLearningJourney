class EThread extends Thread {
    public void run(int w) {
        Thread t = Thread.currentThread();

        System.out.println(w + " - run() - " + t.getName());
    }
}

class H {
    public static void main(String[] args) {
        EThread x = new EThread();
        x.setName("Golu");
        x.start();
        x.run(12);

        Thread t = Thread.currentThread();

        System.out.println("main() - " + t.getName());
    }    
}
