import java.sql.DriverManager;
import java.sql.Connection;

class Main
{
	public static void main(String ar[])
	{
		System.out.println("Hello World");
		Connection con = null;
		
		try{
			//Class.forname("com.mysql.jdbc.Driver");
		    	con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/testConnection",
			"test", "password123");

		}catch (Exception e){
		    e.printStackTrace();
			System.out.println("Bledzik xdd");

		}
		finally{
			try{ con.close();}
			catch (Exception e){;}
		}
	}
}
