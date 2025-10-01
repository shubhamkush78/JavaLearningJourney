class P {
    public static void main(String[] args) {
        String str = "vinod is a good boy";

        System.out.println(str.endsWith("boy"));
        System.out.println(str.endsWith(" good boy"));
        System.out.println(str.endsWith("buy"));
        System.out.println(str.endsWith("Boy"));
        System.out.println(str.endsWith("boy "));
        System.out.println(str.endsWith(""));
    }
}
