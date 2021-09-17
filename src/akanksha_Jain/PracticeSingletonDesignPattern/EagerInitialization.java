package akanksha_Jain.PracticeSingletonDesignPattern;

public class EagerInitialization {
	private static EagerInitialization connection = getCon();
	
	private EagerInitialization() {
		
	}
	
	public static EagerInitialization getCon() {
		if(connection==null)
			connection = new EagerInitialization();
		return connection;
	}
}
