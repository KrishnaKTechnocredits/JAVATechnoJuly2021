package nishi;

public class Assignment17 {
	
	void getReverseString(String input)
	{
		for(int i =input.length()-1;i>=0;i--)
		{
			System.out.print(input.charAt(i));
		}
	}

	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		System.out.print("Reverse String is : ");
		assignment17.getReverseString("TechnoCredits");		

	}

}
