class C {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println(t.getName() + " - Before: Is Daemon: " + t.isDaemon() + " - Is Alive: " + t.isAlive());

        t.setDaemon(true);

        System.out.println(t.getName() + " - After: Is Daemon: " + t.isDaemon() + " - Is Alive: " + t.isAlive());
    }    
}
