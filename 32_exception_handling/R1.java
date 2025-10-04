class R1 {
    public static void main(String[] args) {
        System.out.println(1);
        
        finally {
            System.out.println(2);
        }

        System.out.println(3);
    }    
}


// R1.java:5: error: 'finally' without 'try'
//         finally {
//         ^
// 1 error
