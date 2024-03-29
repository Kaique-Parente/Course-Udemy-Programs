package application;


import db.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {
        
        Connection conn = null;
        PreparedStatement st = null;
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "INSERT INTO seller"
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                    + "VALUES"
                    + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            
            st.setString(1, "Carl");
            st.setString(2, "carl@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
            st.setDouble(4, 3000.0);
            st.setInt(5, 4);
            
            int rowsAffected = st.executeUpdate();
           
            /*
            st = conn.prepareStatement(
                    "INSERT INTO department"
                    + "(Name)"
                    + "VALUES"
                    + "('D1'), ('D2')",
                    Statement.RETURN_GENERATED_KEYS
            );
            */
            
            if(rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                
                while(rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            } else {
                System.out.println("No rowsAffected!");
            }
          
        }
        catch(SQLException e) {
            e.printStackTrace();
        } 
        catch (ParseException e) {
            e.printStackTrace();
        } 
    }
}
