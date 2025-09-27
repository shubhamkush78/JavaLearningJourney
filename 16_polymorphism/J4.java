class J4 {
    public static void main(String[] args) {
        SpiderMan spm = new SpiderMan();
        ShaktiMan skm = new ShaktiMan();
        IronMan irm = new IronMan(); 
        
        inviteGuest(spm);
        inviteGuest(skm);
        inviteGuest(irm);
    }   

    static void inviteGuest(SuperHuman x) {
        System.out.println("Welcome Guest: " + x);
        System.out.println("Serve Food");
    }
}
