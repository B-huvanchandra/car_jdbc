import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Updatecar {
    public static void main(String args[]){
        try{
           String url="jdbc:mysql://localhost:3306/car";
           String user="root";
           String pass="Bhuvan@2003";
           Connection con=DriverManager.getConnection(url,user,pass);
           String update="update car_details set car_name=? where car_id=? ";
           PreparedStatement per=con.prepareStatement(update);
           per.setString(1, "thar003");
           per.setInt(2, 111);
           per.executeUpdate();
           System.out.println("updated successfully");

        }catch(SQLException e){
            System.out.println(e);

        }
    }
    
}
