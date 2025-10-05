class DThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        System.out.println("run() - " + t.getName());
    }
}

class G {
    public static void main(String[] args) {
        DThread x = new DThread();
        x.setName("Golu");
        x.run();

        Thread t = Thread.currentThread();

        System.out.println("main() - " + t.getName());
    }    
}
