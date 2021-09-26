package riten;

class ReverseOrderArray{
	
	String[] reverseOrderElem(String[] arr){
		String temp="";
		for(int index=arr.length-1;index>=0;index--){
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
		ReverseOrderArray reverseorder=new ReverseOrderArray();
		String[] input = {"techno", "credits", "krishna","harsh"};
		reverseorder.reverseOrderElem(input);
		
		
		
	}
}