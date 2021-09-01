package purshottamJoshi;

class Assignment24_2{
	void maxRepeatWord(String str){
		int max=0;
		String word ="";
		String[] newstr = str.split(" ");
		for(int index=0; index < newstr.length; index++){
			int count=1;
			for(int j=index+1; j < newstr.length; j++){
				if(newstr[index].equals(newstr[j])){
						
						count++;
				}
				if(count > max){
					max=count;
					word=newstr[index];
				}
			}
		}
		System.out.println("Most Repeating Word in string : "+word+" repeating "+max+" times");
	}	
	public static void main(String[] args){
		String input ="Hi Hello Hi Techno Hello Hi";
		Assignment24_2 assignment24_2 = new Assignment24_2();
		assignment24_2.maxRepeatWord(input);
		
	}

}