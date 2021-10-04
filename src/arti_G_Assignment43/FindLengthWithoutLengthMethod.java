package arti_G_Assignment43;
//Find length of the string without using length method
public class FindLengthWithoutLengthMethod {

	void getStringLength(String str){
			int count=0;
			while(true) {
				try {
					str.charAt(count);
					count++;
				}catch(StringIndexOutOfBoundsException e) {
					break;
					}
				}
			System.out.println("String "+str+" Length is : "+ count);
	}
	public static void main(String[] args) {
		FindLengthWithoutLengthMethod a1 = new FindLengthWithoutLengthMethod();
		String str= "technocredits";
		a1.getStringLength(str);
	}

}
