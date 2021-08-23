package nidhi;

import java.util.Scanner;

class Assignment_20_Program_3{
	
	int countChar(String str, char ch){
		int cnt=0;
		for(int i=0;i<str.length();i++){
			if (str.charAt(i) == ch){
				cnt++;
			}
		}
		return cnt;
	}
	
	void UniqueChar(String str){

		for(int i=0;i<str.length();i++){
			if (i == str.indexOf(str.charAt(i))) {
				int cnt = countChar(str,str.charAt(i));
				if (cnt ==1) {
					System.out.println(str.charAt(i));
				}
				
			}
		}
			
	}
	
	public static void main(String[] arg){
	Assignment_20_Program_3 assignment20 = new Assignment_20_Program_3();
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter the String:");
	String text = scanner.next();
	assignment20.UniqueChar(text);
	}
	
	
	
}