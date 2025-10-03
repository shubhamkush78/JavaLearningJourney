class M {
    public static void main(String[] args) {
        
        try {
            int i = Integer.parseInt(args[0]);

            String x = "ram";
            System.out.println(x.charAt(i));
            
            int[] y = {23, 45};
    
            System.out.println(y[i]);
        } catch(IndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("problem solved -");
        } catch(NumberFormatException e) {
            System.out.println(e);
            System.out.println("problem solved $");
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("problem solved #");
        }

        System.out.println("############");
    }    
}

// M.java:19: error: exception StringIndexOutOfBoundsException has already been caught
//         } catch(StringIndexOutOfBoundsException e) {
//           ^
// 1 error