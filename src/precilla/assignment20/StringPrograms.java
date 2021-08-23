package precilla.assignment20;
import java.util.Scanner;
public class StringPrograms {
	int getFrequencyofUserDefinedString(String str,char ch) {
		int count=0;
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index)==ch)
				count++;
		}
		System.out.println("count "+count);
		return count;
	}	
	void frequencyOfCharacter(String str) {
		char ch=0;
		for(int index=0;index<str.length();index++) {
			int count=0;
			ch=str.charAt(index);	
			for(int index1=0;index1<str.length();index1++) {	
				if(str.charAt(index1)==ch)
					count++;
			}
			if((count>1)&&(index==str.indexOf(str.charAt(index)))) {
				System.out.println(ch +" -> "+count);
			}
			if(count==1)
				System.out.println(ch+ " -> " +count);
		}	
		
	}
	void frequencyOfUniqueCharacter(String str) {
		for(int index=0;index<str.length();index++) {
			int count=0;
			char ch=str.charAt(index);	
			for(int index1=0;index1<str.length();index1++) {	
				if(str.charAt(index1)==ch)
					count++;
			}
			if(count==1)
				System.out.println(ch);
		}		
	}
	void frequencyOfDuplicateCharacter(String str) {
		char ch=0;
		for(int index=0;index<str.length();index++) {
			int count=0;
			ch=str.charAt(index);	
			for(int index1=0;index1<str.length();index1++) {	
				if(str.charAt(index1)==ch)
					count++;
			}	
			if((count>1)&&(index==str.indexOf(str.charAt(index)))) {
				System.out.println(ch +" -> "+count);
			}
		}		
	}
	public static void main(String[] args) {
		StringPrograms stringPrograms=new StringPrograms();
		Scanner scanner=new Scanner(System.in);
		System.out.print("Program 1: \nEnter the String : ");
		String str=scanner.next();
		System.out.print("Enter the Character to find the Frequency : ");
		char ch=scanner.next().charAt(0);
		stringPrograms.getFrequencyofUserDefinedString(str,ch);
		System.out.print("\nProgram 2: \nEnter the String : ");
		String str3=scanner.next();
		stringPrograms.frequencyOfCharacter(str3);
		System.out.print("\nProgram 3: \nEnter the String : ");
		String str1=scanner.next();
		System.out.println("Frequency of unique Chracter");
		stringPrograms.frequencyOfUniqueCharacter(str1);
		System.out.print("\nProgram 4: \nEnter the String : ");
		String str2=scanner.next();
		System.out.println("Frequency of Dupliaate Chracter");
		stringPrograms.frequencyOfDuplicateCharacter(str2);

	}
}
