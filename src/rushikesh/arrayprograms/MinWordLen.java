package rushikesh.arrayprograms;

public class MinWordLen {
	
	String giveMaxLen(String input) {
		String minLenString="";
		String[] arr=input.split(" ");
		int minLenInt = arr[0].length();
		for(int index=0;index<arr.length;index++) {
			if(arr[index].length()<minLenInt) {
				minLenInt=arr[index].length();
				minLenString=arr[index];
			}
		}
	return minLenString;	
	}
	
	public static void main(String[] args) {
		MinWordLen minWordLen=new MinWordLen();
		String input = "good morning technocredits hi hello";
		System.out.println("String having min Length is "+minWordLen.giveMaxLen(input));
	}
}
