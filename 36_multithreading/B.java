class B {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        System.out.println(x);
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println(x.getName());
        System.out.println(x.getPriority());
        System.out.println(x.getId());
    }
}