package priti;

class Assingment_17{

	String getReverseString(String str){
		String output= "";
		for (int index =str.length()-1; index>=0; index-- ){
			output = output + str.charAt(index);
		}return output;
	}	
	 public static void main(String[] args){
		Assingment_17 assingment_17 = new Assingment_17();
		System.out.println("Reverse of Technocredits is = " + assingment_17.getReverseString("Technocredits"));
		
	}	
}
