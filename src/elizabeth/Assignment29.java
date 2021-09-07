/*Program 1 : String Pallindrome by writing reverse method logic.
 String input = "naman";

 program 2: String Pallindrome by without writing reverse method logic.
 String input = "naman";
 String input = "aabbaa";

*/
package elizabeth;
class Assignment29{
	
	boolean isPallindome(String input){
		boolean flag=false;
		String output="";
		for(int index=input.length()-1;index>=0;index--){
			output=output+input.charAt(index);
			if(input.equalsIgnoreCase(output)){
				flag=true;
			}else{
				flag=false;
			}
		}
		if(flag){
			System.out.println(input + " is pallindrome");
		}else{
			System.out.println(input + " is not a pallindrome");
		}
		return flag;
	}
	
	
	boolean isPallindomeWithoutReverse(String input){
		boolean flag=false;
		String output="";
		for(int index=0;index<input.length();index++){
			if(input.charAt(index)==input.charAt((input.length()-1)-index)){
				flag=true;
			}else{
				flag=false;
			}
		}
		if(flag){
			System.out.println(input + " is pallindrome");
		}else{
			System.out.println(input + " is not a pallindrome");
		}
		return flag;	
	}

	public static void main(String[] args){
		Assignment29 assignment29=new Assignment29();
		System.out.println(assignment29.isPallindome("malayalam"));
		System.out.println(assignment29.isPallindome("Elizabeth"));
		System.out.println(assignment29.isPallindomeWithoutReverse("aabbaa"));
		System.out.println(assignment29.isPallindomeWithoutReverse("Mary"));
	}

}