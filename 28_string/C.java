class C {
    public static void main(String[] args) {
        String str = "internationalization";

        int start = 0;

        while((start = str.indexOf('n', start)) != -1) 
            System.out.println(start++);
        
    }    
}
