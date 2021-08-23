package elizabeth;

import java.util.Scanner;

class Assignment20{
	
	int getFrequencyOfGivenChar(String input,char ch){
		int count=0;
		for(int index=0;index<input.length();index++){
			if(input.charAt(index)==ch){
				count++;
			}
		}
		System.out.println("Frequency of " +ch+ " in " +input+ " is " +count);
		return count;
	}
	
	int getFrequencyOfEachChar(String input){
		int frequency=0;
		for(int index=0;index<input.length();index++){
			if(index==input.indexOf(input.charAt(index))){
			frequency=getFrequencyOfGivenChar(input,input.charAt(index));
			}
		}
		
		return frequency;
	}
	
	void getFrequencyOfUniqueChar(String input){
		for(int index=0;index<input.length();index++){
			char ch=input.charAt(index);
			if(input.indexOf(ch)==input.lastIndexOf(ch))
				getFrequencyOfGivenChar(input,ch);
		}
	}

	void getFrequencyOfDuplicateChar(String input){
		for(int index=0;index<input.length();index++){
			char ch=input.charAt(index);
			if(input.lastIndexOf(ch)>input.indexOf(ch)){
				if(index==input.indexOf(ch)){
					getFrequencyOfGivenChar(input,ch);
				}
			}
		}
	}
	
	
	public static void main(String[] args){
		Assignment20 assignment20=new Assignment20();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("---------------Frequency of Given Character--------------------");
		System.out.println("Enter the String :");
		String arr=scanner.next();
		System.out.println("Enter the character :");
		char ch = scanner.next().charAt(0);
		System.out.println(assignment20.getFrequencyOfGivenChar(arr,ch));
		
		System.out.println("---------------Frequency of Each Character--------------------");
		System.out.println("Enter the String :");
		String input=scanner.next();
		assignment20.getFrequencyOfEachChar(input);
		
		System.out.println("--------------Frequency of Unique Characters---------------------");
		System.out.println("Enter the String :");
		String input1=scanner.next();
		assignment20.getFrequencyOfUniqueChar(input1);

		System.out.println("----------------Frequency of Duplicate Characters-------------------");
		System.out.println("Enter the String :");
		String input2=scanner.next();
		assignment20.getFrequencyOfDuplicateChar(input2);
	}
}
					