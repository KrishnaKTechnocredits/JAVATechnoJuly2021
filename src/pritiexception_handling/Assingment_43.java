package pritiexception_handling;

public class Assingment_43 {
	int getStringLength(){
		String str= " Technnocredits";
		 int count=0;
		 while (true) {
			 try {
				 str.charAt(count);
				 count++;
			
			 }catch(StringIndexOutOfBoundsException se){
				 break;
			 }
		
		 }
		 return count;
	}
	
	
	public static void main(String[] a) {
		Assingment_43 assingment_43 = new Assingment_43();
		System.out.println("length without using length as a method and property: "+assingment_43.getStringLength());
	}

}
//get string length without using length as a method and property