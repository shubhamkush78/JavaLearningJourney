class S1 {
    public static void main(String[] args) {
        System.out.println(1);
        
        try {
            System.out.println(2);
            try {
                System.out.println(3);
            } catch(Exception e) {
                System.out.println(4);
            } finally {
                System.out.println(5);                
            }
        } catch(Exception e) {
            System.out.println(6);
            try {
                System.out.println(7);
            } catch(Exception e1) {
                System.out.println(8);
            } finally {
                System.out.println(9);                
            }
        } finally {
            System.out.println(10);                
            try {
                System.out.println(11);
            } catch(Exception e) {
                System.out.println(12);
            } finally {
                System.out.println(13);                
            }
        }

        System.out.println(14);
    }    
}