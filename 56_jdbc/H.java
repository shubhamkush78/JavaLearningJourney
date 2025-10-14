import java.sql.*;

class H {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");

            String query = "insert into students (student_name,email,password) value ('Sudheer Kumar','sudha@gmail.com','999999')";

            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            int res = ps.executeUpdate();

            if(res == 1) {
                ResultSet rs = ps.getGeneratedKeys();

                if(rs.next())
                    System.out.println("New Key: " + rs.getInt(1));
            }

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
