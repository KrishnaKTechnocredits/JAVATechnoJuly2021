package nidhi;

//String str = "t1e12c2h33no3credit4s"; 
//output = 12+33+3+4

class Assignment_25_Program1{
	
	
	int sumNum(String str){
		String a = "";
		int sum=0;
		for (int i=0;i <str.length();i++){
			if (Character.isDigit(str.charAt(i))){
					a = a + str.charAt(i) ;
					for (int j=i+1;j < str.length();j++){
						if (Character.isDigit(str.charAt(j))){
							a = a + str.charAt(j) ;
							}
						else 
							break;
					}
					sum = sum + Integer.parseInt(a);
					i++;
					a="";
			}
		}
		return sum;
	}
	
	public static void main(String[] ae){
		Assignment_25_Program1 assignment25= new Assignment_25_Program1();
		String str = "t1e100c2hno33credit4s";
		System.out.println(assignment25.sumNum(str));
	}
}