import java.sql.Connection;
import java.sql.DriverManager;

public class testConnection {
    public static void main(String[] args) {
        // this is old method of connecting to mysql server
        String dbURL = "jdbc:mysql://localhost:3306/studentmarks";
        String username = "root";
        String password = "root";

        try {
            Connection connection = DriverManager.getConnection(dbURL,username,password);
            System.out.println("Success !");
        }
        catch ( Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
