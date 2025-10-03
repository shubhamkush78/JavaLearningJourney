import java.io.Console;

class G {
    public static void main(String[] args) {
        Console con = System.console();

        System.out.print("Enter a byte value: ");
        String input = con.readLine();

        byte val = Byte.parseByte(input);

        System.out.println("~~~~~output~~~~~~~~~~");
        System.out.println(val);
    }    
}
