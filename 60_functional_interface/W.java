abstract class/*interface*/ GG {
    public abstract void pro();
}

class W {
    public static void main(String[] args) {
        GG x = () -> System.out.println("Hi");
    }    
}
