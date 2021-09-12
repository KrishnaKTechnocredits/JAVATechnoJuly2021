/*Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h 

Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is 
output : techno*/
package elizabeth;
class CodingTest6{
	
	void getFirstNonRepeatingChar(String input){
		for(int index=0;index<input.length();index++){
			char ch=input.charAt(index);
			if(input.indexOf(ch)==input.lastIndexOf(ch)){
				System.out.println(ch);
				break;
			}
		}
	}
	
	void getFirstNonRepeatingWord(String input){
		boolean flag=true;
		String[] output=new String[input.length()];
		output=input.split(" ");
		for(int index=0;index<output.length;index++){
			for(int index1=index+1;index1<output.length;index1++){
				if(output[index].equals(output[index1])){
					flag=false;
					break;
				}else{
					flag=true;
				}
			}
			if(flag){
				System.out.println(output[index]);
				break;
			}
		}
		
	}
	
	public static void main(String[] args){
		CodingTest6 codingTest6=new CodingTest6();
		codingTest6.getFirstNonRepeatingChar("technocredits");
		codingTest6.getFirstNonRepeatingWord("hi this is techno gm credits this hi is");
	}
}