/*Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/
package santosh;
import java.util.Scanner;
public class MaxRepeatingWord {
	void getMaxRepeatingWord(String[] arr) {
	int count=0;
	int maxCount=0;
	String word=" ";
	for(int index1=0;index1<arr.length;index1++) {
		for(int index2=0;index2<arr.length;index2++) {
			if(arr[index1].equals(arr[index2]))
				count++;
		}

		if(maxCount<count) {
			maxCount=count;
			word=arr[index1];
		}
		count=0;
	}

	    System.out.println(word+" :- "+maxCount);
}

	public static void main(String[] args) {
		MaxRepeatingWord MaxRepeatingWord=new MaxRepeatingWord();
		Scanner scanner=new Scanner(System.in);
		String str="Hi Hello Hi Techno Hello Hi";
		System.out.println("String: "+str);
		String[] arr=str.split(" ");
		System.out.println("Maximum repeating word in a given string is ");
		MaxRepeatingWord.getMaxRepeatingWord(arr);

	}
} 
 