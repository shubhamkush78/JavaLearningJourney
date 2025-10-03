import java.io.Console;

class E {
    public static void main(String[] args) {
        Console con = System.console();

        System.out.print("Enter a float value: ");
        String input = con.readLine();

        float val = Float.parseFloat(input);

        System.out.println("~~~~~output~~~~~~~~~~");
        System.out.println(val);
    }    
}
