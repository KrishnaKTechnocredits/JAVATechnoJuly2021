package purshottamJoshi;

class Assignment19_1{
	int count;
	int countWords(String arr){
		
		for(int index=0; index <arr.length();index++){
			char ch = arr.charAt(index);
				if( ch == ' '){
					count++;
				}
		}
		return count+1;
	}
	
	public static void main(String[] args){
		String str = "Hi Techno Credits Hello";
		//str=str.replace(","," ").replace(".","");
		//str=str.replaceAll("//s"," ");
		Assignment19_1 assignment19_1 = new Assignment19_1();
		System.out.println("Total Words in a String : "+assignment19_1.countWords(str)+" words");
	}
	
}