/*Write a program to verify given number plat number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid*/

package elizabeth;
class Assignment35{
	
	void getValidPlateNum(String input){
		boolean flag=false;
		if(input.length()==13){
			String arr[]= new String[input.length()];
			arr=input.split(" ");
			if(arr.length==4){//MH 12 BK 4432
					if(Character.isUpperCase(arr[0].charAt(0))&& Character.isUpperCase(arr[0].charAt(1))){
						if(Character.isDigit(arr[1].charAt(0))&& Character.isDigit(arr[1].charAt(1))){
							if(Character.isUpperCase(arr[2].charAt(0))&& Character.isUpperCase(arr[2].charAt(1))){
								if(Character.isDigit(arr[3].charAt(0))&& Character.isDigit(arr[3].charAt(1)) && Character.isDigit(arr[3].charAt(2))&& Character.isDigit(arr[3].charAt(3))){
									flag=true;
								}else{
									flag =false;
								}
							}else{
								flag=false;
							}
						}else{
							flag=false;
						}
					}else{
						flag=false;
					}	
			}else if(arr.length==3){//MH-12 BK 1432
				if(arr[0].length()==5){
					if(Character.isUpperCase(arr[0].charAt(0))&& Character.isUpperCase(arr[0].charAt(1)) && arr[0].charAt(2)=='-' && Character.isDigit(arr[0].charAt(3))&& Character.isDigit(arr[0].charAt(4))){
						if(Character.isUpperCase(arr[1].charAt(0))&& Character.isUpperCase(arr[1].charAt(1))){
							if(Character.isDigit(arr[2].charAt(0))&& Character.isDigit(arr[2].charAt(1)) && Character.isDigit(arr[2].charAt(2))&& Character.isDigit(arr[2].charAt(3))){
								flag=true;
							}else{
								flag=false;
							}
						}else{
							flag=false;
						}
					}else{
						flag=false;
					}
				}else{
					flag=false;
				}	
			}else{
				flag=false;
			}
			if(flag){
					System.out.println("Valid Format");
			}else{
				System.out.println("Invalid Format");
				}
		}else{
			System.out.println("Invalid Format");
		}
	}
	
	public static void main(String[] args){
		Assignment35 assignment35=new Assignment35();
		assignment35.getValidPlateNum("MH 12 BK 4432");
		assignment35.getValidPlateNum("MH-12 BK 1432");
		assignment35.getValidPlateNum("GJ 05 MK 1123");
		assignment35.getValidPlateNum("MH 12 BK-4432");
		assignment35.getValidPlateNum("MH 12 B0 4432");
		assignment35.getValidPlateNum("MH-un BK 1432");
		assignment35.getValidPlateNum("mk %^ gh 11N3");
		assignment35.getValidPlateNum("MH 12-BK 4432");
	}
}