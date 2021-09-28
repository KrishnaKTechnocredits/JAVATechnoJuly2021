package bhagyashree;

public class Assignment35 {//"/^[ A-Za-z0-9_@./#&+-]*$/"
	
	void validateNumberPlate(String numberPlate)
	{
	if (numberPlate.length() == 13) {
		String str[] = numberPlate.split(" ");
		if (((str[0].length() == 2) || (str[0].length() == 5 && numberPlate.charAt(2) == 45)) && (str[1].length() == 2)) {
			System.out.println("Given " + numberPlate + " String is valid string");

		} else {
			System.out.println("Given " + numberPlate + " String is not valid string");
		}
	} else {
		System.out.println("Given " + numberPlate + "String is not valid string");
	}
	}
	public static void main(String[] args)
	{
		Assignment35 ass35=new Assignment35();
		ass35.validateNumberPlate("MH 12 BK 4432");
		
		ass35.validateNumberPlate("MH-12 BK 1432");
		
		ass35.validateNumberPlate("GJ 05 MK 1123");
		
		ass35.validateNumberPlate("MH 12-BK 4432");
	}
	
	

}
