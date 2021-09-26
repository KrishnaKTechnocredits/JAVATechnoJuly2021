package purshottamJoshi;

class Assignment18_2{
	String getReverse(String str) {  
		String output="";  
		for(int i=str.length()-1; i>= 0; i--) {  
			output = output + (str.charAt(i));   
		}  
		return output;  
	}
	String[] reverseOrder(String[] revOrder){
		for(int index =revOrder.length-1; index>=0; index-- ){
			revOrder[index] = getReverse(revOrder[index]);
		}
		return revOrder;
	}
	public static void main(String[] args){
		String[] input = {"techno", "credits", "krishna","harsh"};
		Assignment18_2 assignment18_2 = new Assignment18_2();
		assignment18_2.reverseOrder(input);
		System.out.println("Reverse String in Reverse Array : ");	
		for(int index=input.length-1; index >=0; index--){
			System.out.println(input[index]);	
		}
	}
}
