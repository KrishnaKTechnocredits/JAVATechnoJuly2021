package precilla.codingtest6;

public class Program2 {
	public static void main(String[] args) {
		System.out.println("Program 2: Find first non repeating word from a given String");
		String input="hi this is techno gm credits this hi is";
		System.out.print("Input :"+input);
		String[] arr=input.split(" ");
		Program2 program2=new Program2();
		program2.getNonRepetatingWords(arr);
	}
	private void getNonRepetatingWords(String[] arr) {
	String temp="";
	int wordIndex=0;
	while(wordIndex<arr.length) {
		int count=0;
		temp=arr[wordIndex];
		for(int index=0;index<arr.length;index++) {
			if(arr[index].equals(temp))
				count++;
		}
		if(count==1) {
			System.out.print("\nOutput :"+temp);
			break;
		}
		wordIndex++;
		}
	}			

}