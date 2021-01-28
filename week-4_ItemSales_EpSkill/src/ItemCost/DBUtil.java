package ItemCost;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class DBUtil {

		final static String forNameURL="com.mysql.jdbc.Driver";
		final static String dBURL="jdbc:mysql://127.0.0.1:3306/sales?autoReconnect=true&useSSL=false";
		final static String username="root";
		final static String password="aaa9502547922";
		public static Connection DBConnection() throws SQLException, ClassNotFoundException{
			Class.forName(forNameURL);
			Connection con=DriverManager.getConnection(dBURL,username,password);
			return con;
		}
	}
