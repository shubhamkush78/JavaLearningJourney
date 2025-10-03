class Q3 {
    public static void main(String[] args) {
        System.out.println(1);
        
        try {
            System.out.println(2);            
        } catch(ArithmeticException e) {
            System.out.println("3a");
        } finally {
            System.out.println(4);            
        } catch(NullPointerException e) {
            System.out.println("3b");
        }

        System.out.println(6);
    }    
}

// Q3.java:11: error: 'catch' without 'try'
//         } catch(NullPointerException e) {
//           ^
// 1 error