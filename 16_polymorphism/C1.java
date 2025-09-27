class C1 {
    public static void main(String[] args) {
        SpiderMan x = new SpiderMan();
        ShaktiMan z = new ShaktiMan();

        inviteForLunch(x);
        inviteForLunch(z);
    }   
    
    static void inviteForLunch(SpiderMan y) {
        System.out.println("Welcome Guest: " + y);
        System.out.println("Serve Food");
    }
}

class SpiderMan { }
class ShaktiMan { }


// C1.java:7: error: incompatible types: ShaktiMan cannot be converted to SpiderMan
//         inviteForLunch(z);
//                        ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error