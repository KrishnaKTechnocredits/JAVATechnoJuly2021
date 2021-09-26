package technocredits1.singleton;

public class DBConnection {
	
	private static DBConnection con;

	private DBConnection() {
		
	}
	
	public static DBConnection getConnection() {
		if(con==null)
			con = new DBConnection();
		return con;
	}
}
