package technocredits1.singleton;

public class StaticSingleton {
	private static StaticSingleton con;

	static {
		con = new StaticSingleton();
	}

	private StaticSingleton() {
	}

	public static StaticSingleton getConnecttion() {
		if (con == null) {
			con = new StaticSingleton();
		}
		return con;
	}
}
