import java.sql.*;

class H1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb?user=root&password=1234");

            String query = "insert into students (student_name,email,password) values ('Sudheer Kumar','sid@gmail.com','999989'),('Pankaj Kumar','panku@gmail.com','888888'),('Surya Kumar','sooraj@gmail.com','000000'),('Nobita Kumar','nobi@gmail.com','121212')";

            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            int res = ps.executeUpdate();

            if(res >= 1) {
                ResultSet rs = ps.getGeneratedKeys();

                while(rs.next())
                    System.out.println("New Key: " + rs.getInt(1));
            }

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
