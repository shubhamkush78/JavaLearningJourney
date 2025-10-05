class T {   
    public static void main(String[] args) {
        Thread y = Thread.currentThread();

        System.out.println(y);
        
        try { y.join(); } catch(InterruptedException e) { e.printStackTrace(); }        
        
        for(int i=0;i<30;i++)
            System.out.println(i + " - " + y.getName());
    }    
}
