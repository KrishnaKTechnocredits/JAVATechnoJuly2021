package nidhi;

import java.util.Scanner;

class Assignment_20_Program_4{
	
	int countChar(String str, char ch){
		int cnt=0;
		for(int i=0;i<str.length();i++){
			if (str.charAt(i) == ch){
				cnt++;
			}
		}
		return cnt;
	}
	
	void dublicateChar(String str){

		for(int i=0;i<str.length();i++){
			if (i == str.indexOf(str.charAt(i))) {
				int cnt = countChar(str,str.charAt(i));
				if (cnt !=1) {
					System.out.println(str.charAt(i) + " : " + cnt);
				}
				
			}
		}
			
	}
	
	public static void main(String[] arg){
	Assignment_20_Program_4 assignment20 = new Assignment_20_Program_4();
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter the String:");
	String text = scanner.next();
	assignment20.dublicateChar(text);
	}
	
}