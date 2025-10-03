import java.io.Console;

class I {
    public static void main(String[] args) {
        Console con = System.console();

        System.out.print("Enter a long value: ");
        String input = con.readLine();

        float val = Float.parseFloat(input);

        System.out.println("~~~~~output~~~~~~~~~~");
        System.out.println(val);
    }    
}