class O {
    public static void main(String[] args) {
        String str = "vinod is a good boy";

        System.out.println(str.startsWith("vinod"));
        System.out.println(str.startsWith("vinod is "));
        System.out.println(str.startsWith("vanod"));
        System.out.println(str.startsWith("Vinod"));
        System.out.println(str.startsWith(" vinod"));
        System.out.println(str.startsWith(""));
    }
}
