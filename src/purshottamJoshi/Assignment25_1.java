package purshottamJoshi;

class Assignment25_1{
	String upperCase="",lowerCase="";
	String digits="";
	String  getUpperLower(String newstr){
		for(int index=0; index < newstr.length(); index++){
			if(Character.isUpperCase(newstr.charAt(index))) {
				upperCase += newstr.charAt(index);
			}if(Character.isDigit(newstr.charAt(index)))	{
				digits += newstr.charAt(index);
			}if(Character.isLowerCase(newstr.charAt(index))){
				lowerCase += newstr.charAt(index);
			}
		}
		return upperCase+digits+lowerCase;
	}
	
	public static void main(String[] args){
		String str = "Ma1U2liK";
		Assignment25_1 assignment25_1 = new Assignment25_1();
		System.out.println(assignment25_1.getUpperLower(str));
		
	}
}