class K {
    public static void main(String[] args) {
        try {
            System.out.println(1);
            String num = args[0];
            
            System.out.println(2);
            int i = Integer.parseInt(num);
            
            System.out.println(3);
            int[] x = {1, 0, 3, 2};
            System.out.println(x[i] + " ~~");
            
            System.out.println(4);
            int y = 12/x[i];
            System.out.println(y + " ~~");
        } catch(ArrayIndexOutOfBoundsException e) {  
            System.out.println(e);
        } catch(NumberFormatException e) {  
            System.out.println(e);
        } catch(ArithmeticException e) {  
            System.out.println(e);
        }

        //Different Solutions for Different Problems

        System.out.println(" ~~~ I am safe ~~~");
    }    
}

// input(CMD @ >java G): <nothing>, raj, 4, 1, 0, 2, 3,