class I {
    public static void main(String[] args) {
        System.out.println(1);
        String num = null;
        
        try {
            num = args[0];
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("1 error");
        }
        
        System.out.println(2);
        int i = 0;
        try {
            i = Integer.parseInt(num);
        } catch(NumberFormatException e) {
            System.out.println("2 error");
        }
        
        System.out.println(3);
        int[] x = {1, 0, 3, 2};
        
        try {
            System.out.println(x[i] + " ~~");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("3 error");
        } 
        
        System.out.println(4);
        int y = 0;
        try{
            y = 12/x[i];
        } catch(ArithmeticException e) {
            System.out.println("4 error");
        }
        System.out.println(y + " ~~");
    }    
}


// input(CMD @ >java G): <nothing>, raj, 4, 1, 0, 2, 3, 