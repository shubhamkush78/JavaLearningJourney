import java.io.Console;

class F {
    public static void main(String[] args) {
        Console con = System.console();

        System.out.print("Enter a double value: ");
        String input = con.readLine();

        double val = Double.parseDouble(input);

        System.out.println("~~~~~output~~~~~~~~~~");
        System.out.println(val);
    }    
}
