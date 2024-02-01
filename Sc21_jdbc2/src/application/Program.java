package application;

import db.DB;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {
        
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        try{
        conn = DB.getConnection();
        st = conn.createStatement();
        rs = st.executeQuery("select * from Department");
        
        while(rs.next()) {
            System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
        }
                
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
            DB.closeConnection();
        }
    }
}
