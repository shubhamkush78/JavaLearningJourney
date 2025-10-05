class B1 {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        System.out.println(x);
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println("Thread Name: " + x.getName());
        System.out.println("Thread Priority: " + x.getPriority());
        System.out.println("Thread ID: " + x.getId());
    }
}