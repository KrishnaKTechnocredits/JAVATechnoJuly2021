package swati;
class FindMiddleCharOfString{
	
	void returnMiddlechar(){
		String[] input ={"hello","techno","credits"};
		int midindex=0;
		char[] output= new char[input.length];
		
		for(int index=0;index<input.length;index++){
			if(input[index].length()%2==0){
				midindex=input[index].length()/2-1;
				}
			else{
				midindex=input[index].length()/2;
			}
		
			    output[index]=input[index].charAt(midindex);
				System.out.println("Middle character of "+input[index]+" is: "+ output[index]);
		}
		
	}
	

		
		public static void main(String[] a){
			FindMiddleCharOfString findmidchar=new FindMiddleCharOfString();
			findmidchar.returnMiddlechar();
		}
}