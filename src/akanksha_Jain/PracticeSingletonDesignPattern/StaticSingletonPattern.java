package akanksha_Jain.PracticeSingletonDesignPattern;

public class StaticSingletonPattern {
	private static StaticSingletonPattern conn;
	
	static {
		conn = new StaticSingletonPattern();
	}
	
	public static StaticSingletonPattern getConn() {
		if(conn==null)
			conn = new StaticSingletonPattern();
		return conn;
	}
}
