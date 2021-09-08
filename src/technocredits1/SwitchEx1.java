package technocredits1;

public class SwitchEx1 {

	void processData(int dayIndex) {
		switch(dayIndex) {
			
			default :
			System.out.println("Invalid input");
			case 1: 
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 7 :
				System.out.println("Sunday");
				break;
		}
		
		String operation = "debit";
		String bank = "ICICI";
		
		switch(operation) {
			case "debit" :
			{
				/*if(bank.equals("SBI"))
					System.out.println("Max limit is 50k");
				else if(bank.equals("ICICI"))
					System.out.println("Max limit is 25k");*/
				switch(bank) {
					case "SBI":
						System.out.println("Max limit is 50k");
						break;
					case "ICICI" :
						System.out.println("Max limit is 25k");
						break;
					
				}
				
				
				System.out.println("");
				System.out.println("");
				break;
			}
			case "credit" :
				System.out.println("");
				break;
			
			case "A":
			case "a":
				System.out.println("Its a vowel");
				break;
				
			case "print" :
				System.out.println("");
				break;
				
			default :
				System.out.println("Invalid input");
		}
		
		boolean flag = false;
		
	}
	
	int m1(String str) {
		switch(str) {
			case "ptc" :
				return 1;
			case "globant" :
				return 2;
			default :
				return 3;
		}
	}
	
	public static void main(String[] args) {
		new SwitchEx1().processData(13);
	}
}
