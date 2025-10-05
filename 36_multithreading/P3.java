class K3Thread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        
        for(int i=0;i<100;i++)
            System.out.println(i + " - " + t.getName());
    }
}

class P3 {
    public static void main(String[] args) {
        K3Thread e = new K3Thread();
        e.setName("Jaggu");

        System.out.println(e.isAlive());

        e.start();
        
        System.out.println("~~~~~~~~~start~~~~~~~~~~");
        try { Thread.sleep(10); } catch(InterruptedException x) {x.printStackTrace();} 
        System.out.println("~~~~~~~~~~~end~~~~~~~~");

        System.out.println(e.isAlive());
    }
}
