// Program to return middle char of all elements of the String array.
package shreya;

public class MiddleChar {
	void getMiddleChar(String[] num) {
		char charMiddle;
		for(int index=0;index<num.length;index++) {
			if(num[index].length()%2==0)
				charMiddle=num[index].charAt(((num[index].length())/2)-1);
			else 
				charMiddle=num[index].charAt((num[index].length())/2);
			System.out.println(num[index]+" "+charMiddle);
		}
	}

	public static void main(String[] args) {
		String[] input=  {"hello","techno","credits"};
		MiddleChar middleChar=new MiddleChar();
		System.out.println("Print middle character of elements from given array");
		middleChar.getMiddleChar(input);
	}
}
