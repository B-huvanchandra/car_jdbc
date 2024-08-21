import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Driver;
import java.sql.Statement;
import java.sql.SQLException;

public class Insertcar {
    public static void main(String args[]){
        try{
        String url="jdbc:mysql://localhost:3306/car";
        String user="root";
        String pass="Bhuvan@2003";
        Connection con=DriverManager.getConnection(url, user, pass);
        String insert ="insert into car_details() values(?,?,?)";
        PreparedStatement pre=con.prepareStatement(insert);
        pre.setInt(1, 115);
        pre.setString(2, "MaruthiSuziki");
        pre.setString(3, "Maruthi");
        pre.executeUpdate();
        System.out.println("inserted successfully");
        
        }catch(SQLException e){
        System.out.println(e);
        }
    }
    
}
