package chandani.Assignment35;

class Assignment35{

	boolean isValidNumberPlates(String str){
			boolean status = false;
			
			if(str.length() == 13){
				if (str.charAt(5) == ' ' && str.charAt(8) == ' ') {
					if(str.charAt(2) == ' ' || str.charAt(2) == '-'){
						if(Character.isDigit(str.charAt(3)) && Character.isDigit(str.charAt(4)) && 
								Character.isDigit(str.charAt(9)) && Character.isDigit(str.charAt(10)) && Character.isDigit(str.charAt(11)) && Character.isDigit(str.charAt(12))){
							if(Character.isUpperCase(str.charAt(0)) && Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(6)) && Character.isUpperCase(str.charAt(7))){
								status = true;
							}else
								status = false;
						}else
							status = false;
					}else
						status = false;
				}else 
					status = false;
	
			}else 
				status = false;
			
			return status;
	}
	
	void displayValidInvalidNumPlate(String str)
		{
			boolean flag = isValidNumberPlates(str);
			if(flag)
			{
				System.out.println("Given string is a valid number plate");
			}
			else
			{
				System.out.println("Given String is not a valid number plate");
			}
		}

	public static void main(String[] args){
			Assignment35 assignment35 = new Assignment35();
			String str1 = "MH 12 BK 4432";
			String str2 = "MH-12 BK 1432";
			String str3 = "GJ 05 MK 1123";
			String str4 = "MH 12-BK 4432";
			String str5 = "MH-12-BK 4432";
			String str6 = "M2 12 BK ABCD";

			assignment35.displayValidInvalidNumPlate(str1);
			assignment35.displayValidInvalidNumPlate(str2);
			assignment35.displayValidInvalidNumPlate(str3);
			assignment35.displayValidInvalidNumPlate(str4);
			assignment35.displayValidInvalidNumPlate(str5);
			assignment35.displayValidInvalidNumPlate(str6);
			
	}
}