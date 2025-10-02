class D {
    public static void main(String[] args) {
        String str = "internationalization";

        int end = str.length()-1;

        while((end=str.lastIndexOf('n', end)) != -1)
            System.out.println(end--);
        
    }    
}
