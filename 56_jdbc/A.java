import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class A {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/schooldb?user=root&password=1234");
            
            PreparedStatement ps = con.prepareStatement("select * from students");
            
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                System.out.print(rs.getInt("student_id") + " - ");
                System.out.print(rs.getString("student_name") + " - ");
                System.out.print(rs.getString("email") + " - ");
                System.out.println(rs.getString("password") + " - ");
            }

            con.close();
        } catch(SQLException e) {

        } catch(ClassNotFoundException e) {

        }
    }
}