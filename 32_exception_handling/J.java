class J {
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
        } catch(Exception e) {  // catch-all
            System.out.println("Hum se na ho payega : " + e);
        }

        System.out.println(" ~~~ I am safe ~~~");
    }    
}

// input(CMD @ >java G): <nothing>, raj, 4, 1, 0, 2, 3, 