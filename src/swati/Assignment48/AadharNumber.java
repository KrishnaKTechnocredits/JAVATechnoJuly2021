package swati.Assignment48;

/*
 * Program 1: Create a system to generate AadharNumber with rules discussed in class.
 */
import java.util.HashMap;
import java.util.Map;

public class AadharNumber {
	static HashMap <String ,String> map1=new HashMap<String,String>();

	String returnAdharNumber(String panNum) {
		if(!map1.containsKey(panNum)) 
			map1.put(panNum, panNum+1);
			map1.get(panNum);
			return map1.get(panNum);		 		
	}
	
	public static void main(String[] a) {
		AadharNumber a1 =new AadharNumber();
		String adhar=a1.returnAdharNumber("AXYZD12AZ");
		System.out.println("Adhar number for PAN-AXYZD12AZ :"+adhar);
		adhar=a1.returnAdharNumber("AXYZD12AZ");
		System.out.println("Adhar number for PAN-AXYZD12AZ :"+adhar);
		adhar=a1.returnAdharNumber("XYZD142DG");
		System.out.println("Adhar number for PAN-XYZD142DG :"+adhar);	
		System.out.println(map1);
	}
	
}

