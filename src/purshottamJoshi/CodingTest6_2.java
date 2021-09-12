package purshottamJoshi;

class CodingTest6_2{
	void firstNonRepeatingWord(String str){
		String[] input=str.split(" ");
		for(int index=0; index < input.length; index++){
			boolean checkNonRepeatchar=true;
				
			for(int innerindex=0; innerindex <input.length; innerindex++){
				if(index != innerindex && input[index].equals(input[innerindex])){
					checkNonRepeatchar=false;
				}
			}if(checkNonRepeatchar){
				System.out.println("First non repeating word is "+input[index]);
				break;
			}
		}
	}
	
	public static void main(String[] args){
		String input = "hi this is techno gm credits this hi is";
		CodingTest6_2 codingTest6_2 = new CodingTest6_2();
		codingTest6_2.firstNonRepeatingWord(input);
		
	}
}