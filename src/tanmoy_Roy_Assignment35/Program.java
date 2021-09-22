/*
 * Assignment - 35 : 16th Sep'2021

Write a program to verify given number plate number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid

 */

package tanmoy_Roy_Assignment35;

public class Program {
	
	boolean isValidNumberPlate(String input) {
		String[] arr = input.replaceAll("-"," ").split(" ");
		boolean flag= true;
		if(arr.length!=4)
			flag= false;
		else
			if(arr[0].length()==2 && arr[1].length()==2 && arr[2].length()==2 && arr[3].length()==4)
				for(int i=0;i<arr.length;i++) {
					String element=arr[i];
					if(i%2==0)
						for(int k=0;k<element.length();k++) {
							if(!Character.isAlphabetic(element.charAt(k))) {
								flag=false;
								break;
							}
						}
					else
						for(int k=0;k<element.length();k++) {
							if(!Character.isDigit(element.charAt(k))) {
								flag=false;
								break;
							}
						}
					if(flag==false)
						break;
				}
			else
				flag=false;
		
		return flag;	
	}

	public static void main(String[] args) {
		Program prg = new Program();
		System.out.println("String = MH 12 BK 4432 Is valid Number ? : "+prg.isValidNumberPlate("MH 12 BK 4432"));
		System.out.println("String = MH-12 BK 1432 Is valid Number ? : "+prg.isValidNumberPlate("MH-12 BK 1432"));
		System.out.println("String = GJ 05 MK 1123 Is valid Number ? : "+prg.isValidNumberPlate("GJ 05 MK 1123"));
		System.out.println("String = MH-12 BK 1432 Is valid Number ? : "+prg.isValidNumberPlate("MH-12 BK 1432"));
		System.out.println("String = MH-12 BK 143251 Is valid Number ? : "+prg.isValidNumberPlate("MH-12 BK 143251"));
		System.out.println("String = MHs-12 BK 1432a Is valid Number ? : "+prg.isValidNumberPlate("MHs-12 BK 1432a"));
		System.out.println("String = MH-122 BK 1432 Is valid Number ? : "+prg.isValidNumberPlate("MHs-12 BK 1432a"));
		
	}

}
