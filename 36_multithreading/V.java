class V {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Thread Name: " + t.getName());
        System.out.println("ID: " + t.getId());
        System.out.println("Alive: " + t.isAlive());
        
        System.out.println("Priority: " + t.getPriority());

        t.setPriority(8);

        System.out.println("-------------------------");
        System.out.println("Priority: " + t.getPriority());
    }    
}
