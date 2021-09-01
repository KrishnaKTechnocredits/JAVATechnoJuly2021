package dattaraj;

public class Coding_TEST2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coding_TEST2 test2 = new Coding_TEST2();
		
		String str = "A1ashVi6";
		System.out.println("Old String is as :" +str);
		System.out.println("New String is as :" +test2.convert_String(str));
	}

	String convert_String(String str) {
		String str_new="";
		
		// TODO Auto-generated method stub
		for (int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				str_new=str_new+Character.toLowerCase(str.charAt(i));
			}else if (Character.isLowerCase(str.charAt(i))) {
				str_new=str_new+Character.toUpperCase(str.charAt(i));
			}else {
				str_new=str_new+str.charAt(i);
			}
		}
		return str_new;
	}

}
