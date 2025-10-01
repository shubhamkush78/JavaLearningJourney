class V {
    public static void main(String[] args) {
        String str = "mohan is a good boy";

        String[] arr = str.split(" ");

        for(String next : arr)
            System.out.println(next);
            
        System.out.println(str);
    }    
}
