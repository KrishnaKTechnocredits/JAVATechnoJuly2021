package technocredits.singleton;

public class Client {

	public static void main(String[] args) {
		StaticSingleton.getConnecttion();
		System.out.println();
		System.out.println(StaticSingleton.getConnecttion());
	}
}
