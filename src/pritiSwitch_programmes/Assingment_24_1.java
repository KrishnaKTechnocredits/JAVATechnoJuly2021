package pritiSwitch_programmes;



public class Assingment_24_1 {
	void countVowelInString(String str) {
		String vowels= "";
		int cntA=0,cntE=0, cntI=0, cntO=0,cntU=0; 
		int totalvowelcnt=0;
		for (int index=0; index<str.length();index++) {
			switch(str.charAt(index)) {
			case 'a':
			case 'A': 
					if (cntA<1)
					vowels = vowels+str.charAt(index)+ " ";
					cntA++;
					totalvowelcnt++;
					break;
			case 'e':
			case 'E': 
					if (cntE<1)
					vowels = vowels+str.charAt(index)+ " ";	
					cntE++;
					totalvowelcnt++;
					break;
			case 'i':
			case 'I': 
					if (cntI<1)
					vowels = vowels+str.charAt(index)+ " ";	
					cntI++;
					totalvowelcnt++;
					break;
					
			case 'o':
			case 'O':
					if (cntO<1)
					vowels = vowels+str.charAt(index)+ " ";		
					cntO++;
					totalvowelcnt++;
					break;
					
			case 'u':
			case 'U':  
					if (cntU<1)
					vowels = vowels+str.charAt(index)+ " ";	
					cntU++;
					totalvowelcnt++;
					break;
			}				
		}
		System.out.println("Total vowel count in given string " +str+ " is: "+totalvowelcnt);
		System.out.println("vowels in " +str+" are :" +vowels);						
					
	}	
	
	public static void main (String[] a) {
		Assingment_24_1 assingment_24_1 = new Assingment_24_1();
		String str = "technocredits";
		assingment_24_1.countVowelInString(str);
		
	}
}
	
	
	

/*Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i */
