package nidhi;

//String str = "Ma1U2liK"
//output : MUK12ali

class Assignment_25_Program2{
	
	String arrangeString(String str){
		String output = "";
		for(int i=0; i <str.length();i++){
			if (Character.isUpperCase(str.charAt(i))){
				output = output + str.charAt(i);
			}	
		}
		
		for(int i=0; i <str.length();i++){
			if (Character.isDigit(str.charAt(i))){
				output = output + str.charAt(i);
			}	
		}
		
		for(int i=0; i <str.length();i++){
			if (Character.isLowerCase(str.charAt(i))){
				output = output + str.charAt(i);
			}	
		}
		return output;
	}
	
	
	public static void main(String[] arg) {
		Assignment_25_Program2 arrange = new Assignment_25_Program2();
		String str = "Ma1U2liK";
		System.out.println("Output String as per requirement : " + arrange.arrangeString(str));
	}
}