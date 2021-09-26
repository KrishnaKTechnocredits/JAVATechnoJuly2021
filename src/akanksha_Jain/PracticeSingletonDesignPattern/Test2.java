package akanksha_Jain.PracticeSingletonDesignPattern;

public class Test2 {

	public static void main(String[] args) {
		DBConnectionClassic user1 = DBConnectionClassic.getConnection();
		DBConnectionClassic user2 = DBConnectionClassic.getConnection();
		System.out.println(user1);
		System.out.println(user2);
		EagerInitialization user3 = EagerInitialization.getCon();
		EagerInitialization user4 = EagerInitialization.getCon();
		System.out.println(user3);
		System.out.println(user4);
		StaticSingletonPattern user5 = StaticSingletonPattern.getConn();
		StaticSingletonPattern user6 = StaticSingletonPattern.getConn();
		System.out.println(user5);
		System.out.println(user6);
	}
}
