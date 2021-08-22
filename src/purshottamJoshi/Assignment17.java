package purshottamJoshi;

class Assignment17{
	String getReverse(String str) {  
		String rev="";  
		for(int i=str.length(); i> 0; --i)  {  
			rev=rev+(str.charAt(i-1));   
		}  
		return rev;  
	}  
	
	public static void main(String[] args){
		Assignment17 assignment17 = new Assignment17();
		System.out.println("Reverse of given String : "+assignment17.getReverse("TechnoCredits"));
		
	}

}