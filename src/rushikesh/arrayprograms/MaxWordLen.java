package rushikesh.arrayprograms;

public class MaxWordLen {
	
	String giveMaxLen(String input) {
		int maxLenInt = 0;
		String maxLenString="";
		String[] arr=input.split(" ");
		for(int index=0;index<arr.length;index++) {
			if(arr[index].length()>maxLenInt) {
				maxLenInt=arr[index].length();
				maxLenString=arr[index];
			}
		}
	return maxLenString;	
	}
	
	public static void main(String[] args) {
		MaxWordLen maxWordLen=new MaxWordLen();
		String input = "good morning technocredits hi hello";
		System.out.println("String having Max Length is "+maxWordLen.giveMaxLen(input));
	}
}
