import java.io.Console;

class D {
    public static void main(String[] args) {
        Console con = System.console();

        System.out.print("Enter a boolean value(true/false): ");
        String input = con.readLine();

        boolean val = Boolean.parseBoolean(input);

        System.out.println("~~~~~output~~~~~~~~~~");
        if(val)
            System.out.println("Hello");
        else
            System.out.println("Hi");
    }    
}
