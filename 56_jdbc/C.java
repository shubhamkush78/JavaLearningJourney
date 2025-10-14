import java.sql.*;

class C {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");

            String query = "insert into students (student_name,email,password) value (?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, args[0]);
            ps.setString(2, args[1]);
            ps.setString(3, args[2]);

            int rowsAffected = ps.executeUpdate();
            
            System.out.println(rowsAffected);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
