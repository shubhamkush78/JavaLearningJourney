import java.io.Console;

class G2 {
    public static void main(String[] args) {
        Console con = System.console();

        System.out.print("Enter a byte value: ");
        String input = con.readLine();

        byte val = Byte.parseByte(input, 8);

        System.out.println("~~~~~output~~~~~~~~~~");
        System.out.println(val);
    }    
}

// input: any octal number
