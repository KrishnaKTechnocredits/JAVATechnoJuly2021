package swati.programmingTest;

public class Test6 {
	
	void fisrtUniqueChar(String input) {
		String firstChar="";
		for(int index=0;index<=input.length()-1;index++) {
			if(input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index))){
				firstChar=input.charAt(index)+"";
				break;
			}
		
		}
		
		
		System.out.println("First Unique char: "+ firstChar);
	}
	
	void firstUniqueWord(String input) {
		String[] arr =input.split(" ");
		boolean flag=false;
		for(int index=0;index<arr.length;index++) {
			for(int innerIndex=index+1; innerIndex<arr.length;innerIndex++) {
				if(arr[index].equals(arr[innerIndex])) {
					flag=false;
					break;
				}
				else
					flag=true;
			}
			if(flag) {
				System.out.println("First non repeating word from a given String: "+arr[index]);
				break;
				
			
			}
		}
	}		
					
	public static void main(String[] a) {
		Test6 t1=new Test6();
		t1.fisrtUniqueChar("technocredits");
		t1.firstUniqueWord("hi this is techno gm credits this hi is");
	}
	
}
