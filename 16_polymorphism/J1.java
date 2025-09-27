class J1 {
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
}


// J1.java:7: error: incompatible types: ShaktiMan cannot be converted to SpiderMan
//         inviteGuest(skm);
//                     ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error