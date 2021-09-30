package swati.Assignment35;

/*Write a program to verify given number plate number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid
 */
public class Assignment35 {
  
	void verifyNumberPlate(String input) {
		boolean flag=false;
		String[] inpuArray= input.split(" ");
		if(inpuArray.length==4) {
			if(isString(inpuArray[0])) {
				if(isNumber(inpuArray[1])) {
					if(isString(inpuArray[2])) {
						if(isNumber(inpuArray[3])) {
							flag=true;
						}
					}					
				}	
			}
		}
		
		else if(inpuArray.length==3) {
			if(inpuArray[0].length()==5) {
			if(inpuArray[0].charAt(2)=='-') {
				if(isString(inpuArray[0].substring(0,2))) {
					if(isNumber(inpuArray[0].substring(3,5))) {
						if(isString(inpuArray[1])) {
							if(isNumber(inpuArray[2])) {
								flag=true;
							}
						}
					}
					
				}
			}
		}else
				flag=false;
			
			
		}
		if(flag) {
			System.out.println(input+": Valid");
		}else
			System.out.println(input+": Invalid");
		
	}
	
	boolean isNumber(String input) {
		boolean flag=false;
		for(int index=0;index<input.length();index++){
			if(Character.isDigit(input.charAt(index))) {
				 flag=true;
			}
			else
				flag=false;
				break;
			}
		
		//System.out.println(flag);
		return flag;
	}
	
	
	boolean isString(String input) {
		boolean flag=false;
		for(int index=0;index<input.length();index++) {
			if(!Character.isDigit(input.charAt(index))) {
				flag=true;
			}
			else
				flag=false;
				break;
			}
		
		//System.out.println(flag);
		return flag;
	}
	
	public static void main(String[] a) {
		Assignment35 a1=new Assignment35();
		//a1.isNumber("12");
		//a1.isString("abc ");
		a1.verifyNumberPlate("MH 12 BK 4432");
		a1.verifyNumberPlate("MH-12 BK 1432");
		a1.verifyNumberPlate("GJ 05 MK 1123");
		a1.verifyNumberPlate("MH 12-BK 4432");
	}
}
