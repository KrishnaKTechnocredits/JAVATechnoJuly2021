/*Program 1: Java Program to Count the Number of Vowels in user defined string.

Input : technocredits
output : vowels are e , o, i 

 */

package anuja_freq;

public class Program1 {
	int count=0;
	int cnt1,cnt2,cnt3,cnt4,cnt5=0;

	void display(String str) {
		System.out.print("Vowels are : ");
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='e' || ch=='o'  || ch=='i' || ch=='a' || ch=='u') 
				count++;
			if((ch=='e' && cnt1==0) || (ch=='o' && cnt4==0) || (ch=='i' && cnt3==0) || (ch=='a' && cnt2==0)
					||( ch=='u' && cnt5==0)) {
				switch(ch) {
				case 'e':
					cnt1++;
					System.out.print(ch+" ");
					break;
				case 'a':
					cnt2++;
					System.out.print(ch+" ");
					break;
				case 'i':
					cnt3++;
					System.out.print(ch+" ");
					break;
				case 'o':
					cnt4++;
					System.out.print(ch+" ");
					break;
				case 'u':
					cnt5++;
					System.out.print(ch+" ");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Program1 program1=new Program1();
		String str="technocredits";
		program1.display(str);
		System.out.println("");
		System.out.println("The count of vowels are "+program1.count);
	}
}
