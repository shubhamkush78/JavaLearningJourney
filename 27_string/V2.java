class V2 {
    public static void main(String[] args) {
        String str = "mohan, sohan, rohan, ganesh, suresh, mukesh, videsh";

        String[] arr = str.split(", ");

        for(String next : arr)
            System.out.println(next);
            
        System.out.println(str);
    }    
}
