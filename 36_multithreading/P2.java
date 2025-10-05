class K2Thread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        
        for(int i=0;i<3;i++)
            System.out.println(i + " - " + t.getName());
    }
}

class P2 {
    public static void main(String[] args) {
        K2Thread e = new K2Thread();
        e.setName("Jaggu");

        System.out.println("Thread: " + e.getName() + " is Alive: " + e.isAlive());

        e.start();
        
        System.out.println("~~~~~~~~~start~~~~~~~~~~ " + Thread.currentThread().getName());
        try { Thread.sleep(1000); } catch(InterruptedException x) {x.printStackTrace();} 
        System.out.println("~~~~~~~~~~~end~~~~~~~~" + Thread.currentThread().getName());

        System.out.println("Thread: " + e.getName() + " is Alive: " + e.isAlive());
    }
}
