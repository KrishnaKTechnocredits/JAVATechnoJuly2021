package purshottamJoshi;

class Assignment19_3{
	public static void main(String[] args){
		String input = "good morning technocredits hi hello";
		String minWord = "";
		//Assignment19_3 assignment19_3 = new Assignment19_3();
		String[] output = input.split(" ");
			for(int index = 0 ;index < output.length;index++){
				for(int j = 0; j<output.length;j++){
					if(output[j].length() < output[index].length()){
					
					minWord=output[j];
				
					}
				}
			
			}
		System.out.println("Minmum Length Word :"+minWord);
	}
}