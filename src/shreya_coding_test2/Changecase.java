package shreya_coding_test2;

import java.util.Scanner;

public class Changecase {
    void stringConvertion(String input){
    	char ch;
    	for(int index=0;index<input.length();index++) {
    		 ch=input.charAt(index);
    		if(Character.isUpperCase(ch)) {
    			System.out.println(Character.toLowerCase(ch));
    		}
    		else if(Character.isLowerCase(ch)) {
    			System.out.println(Character.toUpperCase(ch));
    		}
    		else if(Character.isDigit(ch)) {
    			System.out.println(ch);
    		}
    	}
    	
    }
	public static void main(String[] args) {
		Changecase changecase=new Changecase();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=scanner.next();
        changecase.stringConvertion(str);
    }
}
