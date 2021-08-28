package prajwal;

import java.util.Scanner;
public class FrequencyOfCharacter {
	
int frequency(String name, char alphabet) {
		int count=0;
		for(int i=0 ;i<name.length();i++)
		
		if(name.charAt(i)== alphabet)
		{
			count++;
		}
		
		return count;
	}

  
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrequencyOfCharacter frequencyofcharacter =new FrequencyOfCharacter();
		Scanner scanner = new Scanner (System.in);
		System.out.println("Given word is: ");
		String name = scanner.next();
		System.out.println("Given character is: ");
		char alphabet= scanner.next().charAt(0);
	    int cunn =frequencyofcharacter.frequency(name , alphabet);
	    System.out.println(""+ cunn);
		
		
	}

}
