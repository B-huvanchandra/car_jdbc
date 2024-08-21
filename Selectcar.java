import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Selectcar {
    public static void main(String args[]){
        try{
            String url="jdbc:mysql://localhost:3306/car";
            String user="root";
            String pass="Bhuvan@2003";
            Connection con=DriverManager.getConnection(url,user,pass);
            String select="select * from car_details";
            Statement s=con.createStatement();
             ResultSet r=s.executeQuery(select);
             while(r.next()){
             int roll=r.getInt("car_id");
             String name=r.getString("car_name");
             System.out.println("car_id:"+roll+"car_name:"+name);
             }

            }catch(SQLException e){
                System.out.println(e);
            }
        }
    }


    