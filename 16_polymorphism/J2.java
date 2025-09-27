class J2 {
    public static void main(String[] args) {
        SpiderMan spm = new SpiderMan();
        ShaktiMan skm = new ShaktiMan();
        
        inviteGuest(spm);
        inviteGuest(skm);
    }   
    
    static void inviteGuest(SpiderMan x) {
        System.out.println("Welcome Guest: " + x);
        System.out.println("Serve Food");
    }

    static void inviteGuest(ShaktiMan x) {
        System.out.println("Welcome Guest: " + x);
        System.out.println("Serve Food");
    }
}
