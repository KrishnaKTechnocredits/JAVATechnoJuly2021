package shreya_assignment_19;

public class MaxWordLength {
	void getMaxWordlength(String str) {
		String[] arr=str.split(" ");
		String maxWordlength=arr[0];
			for(int index=0;index<arr.length;index++) {
				if(arr[index].length()>=maxWordlength.length()) {
					maxWordlength=arr[index];
				}
			}
			System.out.println("Maximum word length from "+"\""+ str+"\""+" is "+maxWordlength);
	}
	public static void main(String[] args) {
		MaxWordLength maxWordLength=new MaxWordLength();
		String input = "good morning technocredits hi hello";
		maxWordLength.getMaxWordlength(input);
	}
}
