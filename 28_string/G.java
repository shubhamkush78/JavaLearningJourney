class G {
    public static void main(String[] args) {
        String str = "om a good boy om my friend om is in class 10th om is a good singer";

        int start = 0;

        while((start = str.indexOf("om", start)) != -1)
            System.out.println(start++);

        // System.out.println(str.indexOf("om", 0));
        // System.out.println(str.indexOf("om", 1));
        // System.out.println(str.indexOf("om", 15));
        // System.out.println(str.indexOf("om", 28));
    }
}