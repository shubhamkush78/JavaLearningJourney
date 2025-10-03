class O {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            int x = Integer.parseInt(args[0]);
            System.out.println(2); 
            //System.out.println("Essential Code"); 
        } /*catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println(3);
            System.out.println("Essential Code"); 
        }*/ catch(NumberFormatException e) {
            System.out.println(e);
            System.out.println(4);
            // System.out.println("Essential Code"); 
        } finally {
            System.out.println("~~~ Essential Code ~~~~");
        }
        
        // System.out.println("Essential Code"); 
        System.out.println(5);
    }    
}


// input: 2, raj, <nothing>