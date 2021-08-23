package shreya_assignment_19;

public class MinWordLength {
	void getMinWordlength(String str) {
		String[] arr=str.split(" ");
		String minWordLength=arr[0];
			for(int index=0;index<arr.length;index++) {
				if(arr[index].length()<minWordLength.length()) {
					minWordLength=arr[index];
				}
			}
			System.out.println("Minimum word length from "+"\""+ str+"\""+" is "+minWordLength);
	}
	public static void main(String[] args) {
		MinWordLength minWordLength=new MinWordLength();
		String input = "good morning technocredits hi hello";
		minWordLength.getMinWordlength(input);
	}
}


	


