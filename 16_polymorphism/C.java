class C {
    public static void main(String[] args) {
        SpiderMan x = new SpiderMan();

        inviteForLunch(x);
    }   
    
    static void inviteForLunch(SpiderMan y) {
        System.out.println("Welcome Guest: " + y);
        System.out.println("Serve Food");
    }
}

class SpiderMan { }
class ShaktiMan { }
