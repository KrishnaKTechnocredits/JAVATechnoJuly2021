package suchita;
//Assignment 41

class Assignment41 {

	// WAC to print pattern
	void printPattern(int input) {
		
		for (int index=1;index<=input;index++) {
			
			for(int index2=1;index2<=index;index2++) {
				
				if (index%2 != 0) {
				
					System.out.print("*");
					
				}else {
				
					System.out.print("#");
				}

			}	
			System.out.println(" ");
		}
		System.out.println("-----------");
	}
	public static void main(String[] args) {
		
		Assignment41 assignment = new Assignment41();
		assignment.printPattern(5);
		assignment.printPattern(10);
	}
	
}