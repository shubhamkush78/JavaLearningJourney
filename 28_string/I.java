class I {
    public static void main(String[] args) {
        String str = "om a good boy om my friend om is in class 10th";

        System.out.println(str.lastIndexOf("om"));
        System.out.println(str.lastIndexOf("om", 26));
        System.out.println(str.lastIndexOf("om", 13));
        System.out.println(str.lastIndexOf("om", -1));
    }
}