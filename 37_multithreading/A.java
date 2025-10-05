class MThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        for(int i=0;i<30;i++) {
            System.out.println(i + " - " + t.getName());
        }
    }
}

class A {
    public static void main(String[] args) {
        MThread x = new MThread();
        x.setName("A");
        x.start();

        Thread t = Thread.currentThread();
        for(int i=0;i<30;i++) {
            System.out.println(i + " - " + t.getName());

            if(i > 14)
                Thread.yield();
        }
    }
}