class C3 {
    public static void main(String[] args) {
        SpiderMan x = new SpiderMan();
        ShaktiMan z = new ShaktiMan();

        inviteForLunch(x);
        inviteForLunch(z);
    }  
    
    static void inviteForLunch(Guest y) {
        System.out.println("---Welcome Guest: " + y);
        System.out.println("---Serve Food");
    }
    
    /*
    static void inviteForLunch(SpiderMan y) {
        System.out.println("~Welcome Guest: " + y);
        System.out.println("Serve Food");
    }

    static void inviteForLunch(ShaktiMan y) {
        System.out.println("^Welcome Guest: " + y);
        System.out.println("Serve Food");
    }*/
}

class Guest { }

class SpiderMan extends Guest { }
class ShaktiMan extends Guest { }
