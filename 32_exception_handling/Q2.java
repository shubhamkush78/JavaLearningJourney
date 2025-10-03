class Q2 {
    public static void main(String[] args) {
        System.out.println(1);
        
        try {
            System.out.println(2);            
        } catch(ArithmeticException e) {
            System.out.println("3a");
        } catch(NullPointerException e) {
            System.out.println("3b");
        } finally {
            System.out.println(4);            
        } finally {
            System.out.println(5);            
        }

        System.out.println(6);
    }    
}


// Q2.java:13: error: 'finally' without 'try'
//         } finally {
//           ^
// 1 error