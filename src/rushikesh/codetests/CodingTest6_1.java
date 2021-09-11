package rushikesh.codetests;

public class CodingTest6_1 {
	
	void findNonRepeat(String input) {
		for(int index=0;index<input.length();index++) {
			if(index==input.lastIndexOf(input.charAt(index))) {
				System.out.println("First Unique Character from the given string is:- " +input.charAt(index));
				break;
			}
		}	
		
	}
	
	
	public static void main(String[] args) {
		CodingTest6_1 codingTest6_1=new CodingTest6_1();
		String input= "technocredits";
		codingTest6_1.findNonRepeat(input);
	}
}
