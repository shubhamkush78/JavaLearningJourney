class V1 {
    public static void main(String[] args) {
        String str = "I am in class 10th and i'v scored 78% and I am planning to attend 11th class";

        String[] arr = str.split("\\d\\d");

        for(String next : arr)
            System.out.println(next);
            
        System.out.println(str);
    }    
}
