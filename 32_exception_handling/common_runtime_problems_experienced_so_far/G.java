class G {
    public static void main(String[] args) {
        String x = "mohan";

        System.out.println(x.charAt(30));
    }    
}


// Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 30
//         at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
//         at java.base/java.lang.String.charAt(String.java:1519)
//         at G.main(G.java:5)