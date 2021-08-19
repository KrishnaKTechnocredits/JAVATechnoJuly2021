package akanksha_Jain;

public class Assignment_15_Program_2 {

	void findMiddleChar(String[] str) {
		char ch1, ch2;
		for(int index=0; index<str.length; index++) {
			if(str[index].length()%2==0) {
				ch1 = str[index].charAt(str[index].length()/2-1);
				System.out.println("Middle character in " + str[index] + " is " + ch1);
			}
			else {
				ch2 = str[index].charAt(str[index].length()/2);
				System.out.println("Middle character in " + str[index] + " is " + ch2);
			}		
		}
	}
	
	public static void main(String[] args) {
		String[] str = {"hello","techno","credits"};
		Assignment_15_Program_2 assignment_15_program_2 = new Assignment_15_Program_2();
		assignment_15_program_2.findMiddleChar(str);
	}
}
