package kumar_Ashish.SCoding_Test;

public class StringConvert {
void getConvertedString(String input){
		
		String output = "";
		
		for(int index = 0; index <input.length(); index ++){
			if(Character.isUpperCase(input.charAt(index)))
			{
				output = output + Character.toLowerCase(input.charAt(index));
			}
			if(Character.isLowerCase(input.charAt(index)))
			{
				output = output + Character.toUpperCase(input.charAt(index));
			} 
			if(Character.isDigit(input.charAt(index)))
			{
				output = output + input.charAt(index);
			} 
		
		}
		System.out.println("Input  String is :  " + input);
		System.out.println("Converted  String is :  " + output);

	}
	
	public static void main(String[] args){
		StringConvert stringconvert = new StringConvert();
		stringconvert.getConvertedString("A1ashVi6");
	
	
	
	}

}
