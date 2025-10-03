import java.io.Console;

class H {
    public static void main(String[] args) {
        Console con = System.console();

        System.out.print("Enter a long value: ");
        String input = con.readLine();

        long val = Long.parseLong(input, 16);

        System.out.println("~~~~~output~~~~~~~~~~");
        System.out.println(val);
    }    
}

// input: any hexadecimal number

// (Please also try parseInt, parseShort with or without redix)