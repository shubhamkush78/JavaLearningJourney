import java.sql.Date;
import java.io.IOException;

public final class User extends Human implements Jumpable, Smart, Intelligent {
    public int age;
    public transient String name;
    public Date dob;
    String phone;
    static public final int retirement = 60;
    private String uid;

    public User() {
        System.out.println("Hello Duniya Walon...!!! ~~~~");
    }

    public User(String name) throws ArrayIndexOutOfBoundsException {
        this.name = name;
    }

    protected User(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    private User(int age, String name, Date dob) throws NullPointerException, IllegalArgumentException {
        System.out.println("Constructor is called....!!!");        
        this.age = age;
        this.name = name;
        this.dob = dob;
    }

    public User(int age, String name, Date dob, String phone, String uid) {
        this.age = age;
        this.name = name;
        this.dob = dob;
        this.phone = phone;
        this.uid = uid;
    }    

    public void signin(String email, String password) {
        System.out.println(name + " ~ " + email + " ^^^ " + password);
        //----
    }

    public int signup(String name, String email, String password, int age, char gender) {
        //----
        return 0;
    }

    String signout() throws ArithmeticException, IllegalArgumentException {
        System.out.println(name);
        return "";
    }

    private final void showProfile() throws IOException {
        //----
    }

    public static void updateProfile() throws NullPointerException, ArrayStoreException, NegativeArraySizeException, ArrayIndexOutOfBoundsException {
        //----
    }
}


