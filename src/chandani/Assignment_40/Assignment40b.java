package chandani.Assignment_40;

public class Assignment40b {
	
  void getNumbersFromTheString(String str) {
		
		String[] str1 = str.split(" ");
		System.out.println("The Numbers in the string using Try Catch method is : " );
		
		for(int index1 = 0; index1 < str1.length; index1++) {
			try {
				Double Digits1 = Double.parseDouble(str1[index1]);
				System.out.println(Digits1);
				}catch(NumberFormatException ne) {
				 }	
		}
	}

	public static void main(String[] args) {
		Assignment40b assignment40b = new Assignment40b();
		String str3 = "I have 9.5 years of exp";
		assignment40b.getNumbersFromTheString(str3);
		
	}
}

