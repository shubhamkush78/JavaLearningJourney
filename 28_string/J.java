class J {
    public static void main(String[] args) {
        String str = "om a good boy om my friend om is in class 10th om is a singer";

        int end = str.length()-1;

        while((end = str.lastIndexOf("om", end)) != -1)
             System.out.println(end--);

        // System.out.println(str.lastIndexOf("om"));
        // System.out.println(str.lastIndexOf("om", 26));
        // System.out.println(str.lastIndexOf("om", 13));
        // System.out.println(str.lastIndexOf("om", -1));
    }
}