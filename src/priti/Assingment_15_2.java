package priti;

class Assingment_15_2{
		
	char[] getMiddleCharOfAlleleOfStringArr(String[] inputStr){
		
		char[] midCharOutPut = new char [inputStr.length];
		int middlecharIndex =0;
		
		//middlecharIndex[] =inputStr[index].length()/2;
		
		for (int index=0; index<inputStr.length; index++){
			
			if (inputStr[index].length()%2==0){ 
				
				middlecharIndex =inputStr[index].length()/2-1;
			}else{
				middlecharIndex =inputStr[index].length()/2;
			}
			midCharOutPut[index]=inputStr[index].charAt(middlecharIndex);
		}
			
		return midCharOutPut;
	}
	public static void main(String[] a) {
		String[] name = new String[3];
		name[0] = "hello";
		name[1] = "techno";
		name[2] = " credits";
		Assingment_15_2 assingment_15_2 = new Assingment_15_2();
		char [] middleCharterArray =assingment_15_2.getMiddleCharOfAlleleOfStringArr(name);
		System.out.println("Middle characters of the string elements are = " + middleCharterArray );
	
	
	}
} 