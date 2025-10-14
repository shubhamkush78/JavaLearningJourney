import java.sql.*;

class F {
    public static void main(String[] args) {
        try {   
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb", "root", "1234");

            String query = "delete from students where student_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            System.out.print("Enter Student Id: ");
            ps.setInt(1, Integer.parseInt(System.console().readLine()));

            ps.executeUpdate();

            con.close();
        } catch(SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
