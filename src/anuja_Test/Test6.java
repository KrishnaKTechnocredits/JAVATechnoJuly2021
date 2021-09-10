package anuja_Test;

public class Test6 {
	
	
	static int num=0;
	static int num1=0;
	void display(String str) {
		for(int i=0;i<str.length();i++) {
			int count=0;
			
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)!=str.charAt(j)) {
					count++;
				if(count==12 && num==0) {
					num++;
				System.out.println("Occurence of first non-repeating character in string is : "+str.charAt(i));	
				}
				}
				
			}
			
		}
		
	}
	
	void display1(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			int count=0;
			
			for(int j=0;j<arr.length;j++) {
				if(arr[i]!=arr[j] ){
					count++;
				if(count==8 && num1==0) {
					num1++;
				System.out.println("Occurence of first non-repeating word in string is : "+arr[i]);	
				}
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		Test6 test6=new Test6();
		String str="technocredits";
		String[] arr= {"hi","this","is","techno","gm","credits","this","hi","is"};
		//String[] arr1= {"Hello every"};
		test6.display(str);
		test6.display1(arr);
		
		
	}

}
