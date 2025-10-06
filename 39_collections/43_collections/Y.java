import java.util.Arrays;

class Y {
    public static void main(String[] args) {
        int[] x = {78, 45, 12, 9, 32};        

        for(int i=0;i<x.length;i++) 
            System.out.print(x[i] + " ");
        
        Arrays.sort(x);    
        
        System.out.println();
        for(int i=0;i<x.length;i++) 
            System.out.print(x[i] + " ");        
    }    
}
