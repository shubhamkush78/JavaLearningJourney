class M2 {
    public static void main(String[] args) {
        
        try {
            int i = Integer.parseInt(args[0]);

            String x = "ram";
            System.out.println(x.charAt(i));
            
            int[] y = {23, 45};
    
            System.out.println(y[i]);
        } catch(StringIndexOutOfBoundsException|IndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("problem solved -");
        } catch(NumberFormatException e) {
            System.out.println(e);
            System.out.println("problem solved $");
        } 

        System.out.println("############");
    }    
}