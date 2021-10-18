package laxman;
// To find length without using .length method

public class Assignment43 {
	
	void findLengthWithArray(String input){
		char[] ch=input.toCharArray();
		System.out.println(ch.length);
		
		}
	void findSizewithoutLengthMethod(String input) {
		int count=0;
		while(true) {
			try {
				char ch=input.charAt(count);
				count++;
			}catch(StringIndexOutOfBoundsException e) {
				break;
			}
		}System.out.println(count);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment43 assignment43=new Assignment43();
		assignment43.findLengthWithArray("Technocredits");
		assignment43.findSizewithoutLengthMethod("Technocredits");
	}

}
