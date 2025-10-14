import java.sql.*;
import java.io.Console;

class E {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");

            String query = "update students set student_name=?,email=?,password=? where student_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            Console cn = System.console();

            System.out.println("Enter New Name: ");
            ps.setString(1, cn.readLine());
            System.out.println("Enter New Email: ");
            ps.setString(2, cn.readLine());
            System.out.println("Enter New Password: ");
            ps.setString(3, cn.readLine());

            ps.executeUpdate();

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


// java.sql.SQLException: No value specified for parameter 4