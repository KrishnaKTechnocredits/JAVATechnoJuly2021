package chandani.Assignment_43;

public class Assignment43 {
	
	 void findLengthOfString(String str){
			int count = 0;
			while(true){
			 try{
				char ch = str.charAt(count);
				count++;
			 }catch(StringIndexOutOfBoundsException e){
				break;
			 }
			}
		 System.out.println("Length of the given String " + str + " is " + count);

		}
		public static void main (String[] args){
			Assignment43 assignment43 = new Assignment43();
			String str = "technocredits";
			assignment43.findLengthOfString(str);
		}

}
