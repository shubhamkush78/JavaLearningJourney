class J {
    public static void main(String[] args) {
        SpiderMan spm = new SpiderMan();
        
        inviteGuest(spm);
    }   
    
    static void inviteGuest(SpiderMan x) {
        System.out.println("Welcome Guest: " + x);
        System.out.println("Serve Food");
    }
}
