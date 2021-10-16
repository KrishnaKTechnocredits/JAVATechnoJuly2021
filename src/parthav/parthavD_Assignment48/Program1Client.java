/*   Assignment - 48 : 9th Oct'2021

Program 1: Create a system to generate AadharNumber with rules discussed in class.*/


package parthav.parthavD_Assignment48;

public class Program1Client {

	public static void main(String[] args) {
		AadhaarGenerate citizen1 = new AadhaarGenerate("AMKP5");
		AadhaarGenerate citizen2 = new AadhaarGenerate("QHJK6");
		AadhaarGenerate citizen3 = new AadhaarGenerate("MNWQ1");
		AadhaarGenerate citizen4 = new AadhaarGenerate("AMKP5");
		
		String panCardCitizen1 = citizen1.generateAadhaar();
		String panCardCitizen2 = citizen2.generateAadhaar();
		String panCardCitizen3 = citizen3.generateAadhaar();
		String panCardCitizen4 = citizen4.generateAadhaar();
		
		System.out.println("List of Aadhars generated in the system so far");
		System.out.println(AadhaarGenerate.map.values());
		System.out.println("Total number of Aadhars generated so far: " + AadhaarGenerate.countOfAadharsGenerated);

	}

}
