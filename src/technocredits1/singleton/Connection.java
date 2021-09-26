package technocredits1.singleton;

//Eager Init.
public class Connection {

	private  static Connection con = new Connection();
	
	private Connection() {
	}
	
	public static Connection getConnecttion() {
		return con;
	}
}
