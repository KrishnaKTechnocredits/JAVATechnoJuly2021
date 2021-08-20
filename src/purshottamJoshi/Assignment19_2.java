package purshottamJoshi;

class Assignment19_2{
	public static void main(String[] args){
		String input = "good morning technocredits hi hello";
		//int max =0;
		String maxWord = "";
		//System.out.println(str);
		//Assignment19_2 assignment19_2 = new Assignment19_2();
		String[] output = input.split(" ");
			for(int index = 0 ;index < output.length;index++){
				//if(arr[index])
				if(output[index].length() > maxWord.length()){
					maxWord=output[index];
				System.out.println(output[index]+"-->"+output[index].length());
					
				}
				
			}
			System.out.println("Maximum Length Word :"+maxWord);
	}
}