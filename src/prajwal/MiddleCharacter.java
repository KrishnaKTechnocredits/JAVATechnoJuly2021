package prajwal;

public class MiddleCharacter {
	int sum;
	static char ch1;
	static char ch2;
	static char ch3;

	void middlecharacter(String[] arr)
	{
		ch1 = arr[0].charAt(2);
		ch2= arr[1].charAt(2);
		ch3=arr[2].charAt(2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleCharacter middlecharacter = new MiddleCharacter();
		String [] arr= {"hello", "techno","credits"};
		middlecharacter.middlecharacter(arr);
		System.out.println("middle letter of hello is " +ch1);
		System.out.println("middle letter of techno is " +ch2);
		System.out.println("middle letter of credits is " +ch3);
}
}
