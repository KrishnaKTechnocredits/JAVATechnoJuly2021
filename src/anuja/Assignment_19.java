/*program 1: Find how many words in a given statement.
input = "Hi Techno Credits Hello"
output : 4

program 2: Find maximum word length from given statement.
input = "good morning technocredits hi hello";
output : technocredits

program 3 : Find minimum word length from given statement.
input = "good morning technocredits hi hello";
output : hi

program 4: sum of all numbers in given statement.
input = "10 10 20 30";
output : 70 */


package anuja;

public class Assignment_19 {

	int count,sum=0;
	int count1;

	void display(String input1) {
		for(int i=0;i<input1.length();i++) {
			char ch=input1.charAt(i);
			if(ch==' ')
				count++;
		}
		System.out.println("No.of words are "+ ++count);
	}

	void maxWordLength(String input2) {
		String[] arr=input2.split(" ");
		for(int i=0;i<arr.length;i++) {
			count1=arr[i].length();
			if(count1>sum)
				sum=count1;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()==sum)
				System.out.println("The max word length word is "+arr[i]);
		}
	}

	void minWordLength(String input2) {
		String[] arr=input2.split(" ");
		int sum2=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1].length()<arr[i].length())
				sum2=arr[i-1].length();
			else 
				sum2=arr[i].length();
		}
		for(int i=1;i<arr.length;i++) {
			if(sum2==arr[i].length())
				System.out.println("The min word length word is "+arr[i]);
		}
	}

	void sumOfAllNos(String input4) {
		String[] arr=input4.split(" ");
		int sum4=0;
		int num4=0;
		for(int i=0;i<arr.length;i++) {
			num4=Integer.parseInt(arr[i]);
			sum4=sum4+num4;
		}
		System.out.println("Sum of all nos in a given statement is "+sum4);
	}

	public static void main(String[] args) {
		Assignment_19 assignment_19=new Assignment_19();
		String input1="Hi Techno Credits Hello";
		assignment_19.display(input1);
		String input2="good morning technocredits hi hello";
		assignment_19.maxWordLength(input2);
		assignment_19.minWordLength(input2);
		String input4="10 10 20 30";
		assignment_19.sumOfAllNos(input4);
	}
}
