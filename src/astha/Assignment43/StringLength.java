package astha.Assignment43;

public class StringLength {

	 void getStringLength(String input){
			int count = 0;
			while(true){
			 try{
				char ch = input.charAt(count);
				count++;
			 }catch(StringIndexOutOfBoundsException e){
				break;
			 }
			}
		 System.out.println("Length of the given String " + input + " is " + count);

		}
		public static void main (String[] args){
			StringLength stringLength = new StringLength();
			stringLength.getStringLength("technocredits");;
		}
}
