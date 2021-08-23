package chandani;

import java.util.Scanner;

public class Assignment20c {
		
		void GetEachCharOfString(String input){
			char str = 0;
			for(int index = 0; index < input.length(); index++){
				if(input.indexOf(input.charAt(index))==input.lastIndexOf(input.charAt(index))){
					str = input.charAt(index);
					System.out.println("Unique characters in the input String " + input + " is : " + str);
				}
			}
		}
		
		public static void main(String[] args){
			Assignment20c assignment20c = new Assignment20c();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter the string to display unique characters : ");
			String str = scanner.nextLine();
			assignment20c.GetEachCharOfString(str);
		}
	}
