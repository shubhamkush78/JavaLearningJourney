class R {
    public static void main(String[] args) {
        System.out.println(1);
        
        catch(Exception e) {
            System.out.println(2);
        }

        System.out.println(3);
    }    
}


// R.java:5: error: 'catch' without 'try'
//         catch(Exception e) {
//         ^
// 1 error