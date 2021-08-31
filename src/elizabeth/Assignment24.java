package elizabeth;

class Assignment24{
	
	int getVowelCount(String input){
		
		int count=0;
		for(int index=0;index<input.length();index++){
		char ch=input.charAt(index);
			
				switch(ch){
					case 'A':
					case 'a':
						if(index==input.indexOf(input.charAt(index))){
							System.out.println(ch + " is a vowel");
							count++;
						}
						
						break;
					case 'E':
					case 'e':
						if(index==input.indexOf(input.charAt(index))){
							System.out.println(ch + " is a vowel");
							count++;
						}
						break;
					case 'I':
					case 'i':
						if(index==input.indexOf(input.charAt(index))){
							System.out.println(ch + " is a vowel");
							count++;
						}
						
						break;
					case 'O':
					case 'o':
						if(index==input.indexOf(input.charAt(index))){
							System.out.println(ch + " is a vowel");
							count++;
						}
						
						break;
					case 'U':
					case 'u':
						if(index==input.indexOf(input.charAt(index))){
							System.out.println(ch + " is a vowel");
							count++;
						}
						break;
				}
		}
		return count;
	}
	
	void getMaxRepeatWord(String input){
		int count=0;
		int maxCount=0;
		String maxRepeatWord=" ";
		String[] temp=input.split(" ");
		for(int index=0;index<temp.length;index++){
			count=0;
			for(int index1=index;index1<temp.length;index1++){
					if(temp[index1].equals(temp[index])){
						count++;
					}
			}
			if(maxCount<=count){
				maxCount=count;
				maxRepeatWord=temp[index];
			}
		}
		System.out.println(maxRepeatWord +" and its frequency is " +maxCount);
	}

	public static void main(String[] args){
		
		Assignment24 assignment24=new Assignment24();
		System.out.println(assignment24.getVowelCount("technocredits"));
		System.out.println("--------Max repeating word with its frequency-------");
		assignment24.getMaxRepeatWord("Hi Hello Hi Techno Hello Hi");
	}
}