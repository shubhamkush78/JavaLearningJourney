import java.util.Arrays;

class Y1 {
    public static void main(String[] args) {
        char[] x = {'t','b','m','e','y','g','q'};

        for(int i=0;i<x.length;i++) 
            System.out.print(x[i] + " ");
        
        Arrays.sort(x);    
        
        System.out.println();
        for(int i=0;i<x.length;i++) 
            System.out.print(x[i] + " ");        
    }    
}
