package purshottamJoshi;

class CodingTest6_1{
	
	void firstNonRepeating(String str){
		
		for(int index=0; index < str.length(); index++){
			boolean checkNonRepeatchar=true;
			for(int innerindex=0; innerindex <str.length(); innerindex++){
				if(index != innerindex && str.charAt(index) == str.charAt(innerindex)){
					checkNonRepeatchar=false;
				}
			}if(checkNonRepeatchar){
				System.out.println("First non repeating char is "+str.charAt(index));
				break;
			}
		}
	}
	
	public static void main(String[] args){
		String input = "technocredits";
		CodingTest6_1 codingTest6_1 = new CodingTest6_1();
		codingTest6_1.firstNonRepeating(input);
		
	}
}