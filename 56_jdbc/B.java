import java.sql.*;

class B {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");

            String query = "insert into students (student_name,email,password) value ('Ram Malhotra','ram@gmail.com','123456')";

            PreparedStatement ps = con.prepareStatement(query);

            int rowsAffected = ps.executeUpdate();
            
            System.out.println(rowsAffected);

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
