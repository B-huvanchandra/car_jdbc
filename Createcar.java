
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Driver;

public class Createcar {
    public static void main(String args[]){
        try{
            String url="jdbc:mysql://localhost:3306/car";
            String user="root";
            String pass="Bhuvan@2003";
            Connection con=DriverManager.getConnection(url, user, pass);
            String e_table="create table car_details(car_id int primary key,car_name varchar(30),model varchar(30))";
            Statement s=con.createStatement();
            s.executeUpdate(e_table);
            System.out.println("table created successfully");

        }catch(SQLException e){
                System.out.println(e);
        }
    }
}
