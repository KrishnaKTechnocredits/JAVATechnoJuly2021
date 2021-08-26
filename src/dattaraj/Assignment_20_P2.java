package dattaraj;

import java.util.Scanner;

public class Assignment_20_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_20_P2 assign20_P2 = new Assignment_20_P2();
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Word:");
	    String word = sc.nextLine();
	    
	    System.out.println("Enter Character to count frequency:");
	    char character = sc.nextLine().charAt(0);
	    System.out.println(assign20_P2.getCharCount(word, character));
	  
	    sc.close();
	}

	int getCharCount(String word, char character) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for (int index = 0; index < word.length(); index++) {
			if (word.charAt(index) == character) {
				cnt++;
			}
		}

		return cnt;
	}

}
