package swati.Assignment37;

/*WAP to find a second largest word.
Input: Welcome to the family
Output: family*/

public class Assignment37 {
	String firstMax="";
	String secondMax="";
	int firstIndex=0;
	void findSecondLargestWord(String input) {
		String[] temp=input.split(" ");
		for(int index=0;index<temp.length;index++) {
			if(firstMax.length()<temp[index].length()) {
				firstIndex=index;
				firstMax=temp[index];
			}
				
		}
		temp[firstIndex]="";
		for(int index=0;index<temp.length;index++) {
			if(secondMax.length()<temp[index].length()) {
				secondMax=temp[index];
			}
			
		}
		
		System.out.println("Output: "+ secondMax);
	}

	public static void main(String[] a) {
		Assignment37 a1=new Assignment37();
		a1.findSecondLargestWord("Welcome to the family");
	}
}