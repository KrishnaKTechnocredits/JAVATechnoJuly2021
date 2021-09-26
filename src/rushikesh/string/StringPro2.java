package rushikesh.string;

public class StringPro2 {
	
	void getCountOfRepeat(String input){
		String[] arr=input.split(" ");
		int maxFrequency=0;
		int count=0;
		String repeatWord = "", tempVar;
		for(int index=0;index<arr.length;index++) {
			count=0;
			tempVar = arr[index];
			for(int index1=0;index1<arr.length;index1++) {
				if(tempVar.equals(arr[index1]))
					count++;
				}	
				if(maxFrequency<count) {
					maxFrequency=count;
					repeatWord=arr[index];
			}
		
		}
		System.out.println(repeatWord+"-"+maxFrequency);
	}
	public static void main(String[] args) {
		StringPro2 stringPro1=new StringPro2();
		String input = "Hi Hello Hi Techno Hello Hi";
		stringPro1.getCountOfRepeat(input);
	}

}
