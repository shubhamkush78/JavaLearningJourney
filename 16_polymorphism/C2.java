class C2 {
    public static void main(String[] args) {
        SpiderMan x = new SpiderMan();
        ShaktiMan z = new ShaktiMan();

        inviteForLunch(x);
        inviteForLunch(z);
    }   
    
    static void inviteForLunch(SpiderMan y) {
        System.out.println("~Welcome Guest: " + y);
        System.out.println("Serve Food");
    }

    static void inviteForLunch(ShaktiMan y) {
        System.out.println("^Welcome Guest: " + y);
        System.out.println("Serve Food");
    }
}

class SpiderMan { }
class ShaktiMan { }
