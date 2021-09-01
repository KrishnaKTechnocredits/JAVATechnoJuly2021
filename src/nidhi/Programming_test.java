package nidhi;

class Programming_test{

	String convertLowerToUpper(String str){
		String output = "";
		for (int i=0; i < str.length();i++){
			if (Character.isUpperCase(str.charAt(i)))
				output = output + (Character.toLowerCase(str.charAt(i)));
			else
				output = output + (Character.toUpperCase(str.charAt(i)));
		}
		return output;
	}
	
	public static void main(String[] arg){
		Programming_test convert = new Programming_test();
		String str = "Mau1Li2k3";
		System.out.println(str + " -> " + convert.convertLowerToUpper(str));
	}
}