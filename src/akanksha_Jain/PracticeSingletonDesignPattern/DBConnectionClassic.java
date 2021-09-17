// Singleton classic example

package akanksha_Jain.PracticeSingletonDesignPattern;

public class DBConnectionClassic {
	private static DBConnectionClassic con;
	
	private DBConnectionClassic() {
		
	}
	
	public static DBConnectionClassic getConnection() {
		if(con==null)
			con = new DBConnectionClassic();
		return con;
	}
}
