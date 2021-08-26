//Program 1 : Find total digits in a given string.
//String str = "Te1ch2no3cr4ed3it4s" 
//output : 6
package purshottamJoshi;

class Assignment22{
	
	public static void main(String[] args){
		int count=0;
		String str = "Te1ch2no3cr4ed3it4s";
		for(int index=0;index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean isDigit = Character.isDigit(ch);
				if(isDigit != false){	
					count++;
				}
		}
		System.out.println("Total digits in a string : "+count);
	}
}