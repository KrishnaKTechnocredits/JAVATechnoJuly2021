package riten;

class ReverseArray{
	
	String[] reverseArr(String[] arr){
		String temp="";
		for(int index=0;index<arr.length;index++){
			temp=arr[index];
			for(int input=temp.length()-1;input>=0;input--)
			{
				
			System.out.print(temp.charAt(input));
			
			}
			System.out.print("\t");
			
		}
		return arr;
	}
	
	public static void main(String[] args){
		ReverseArray reversearray=new ReverseArray();
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		reversearray.reverseArr(input);
		
		
		
	}
}