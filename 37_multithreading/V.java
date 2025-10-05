class V {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Name: " + t.getName());
        System.out.println("Id: " + t.getId());
        System.out.println("Priority: " + t.getPriority());
        System.out.println("Alive: " + t.isAlive());
        System.out.println("Daemon: " + t.isDaemon());
    }    
}
