package ankita;

public class Middlechar {
	int middchar;
	void getmiddChar(String[] arr) {
		char [] ch=new char[3];
	 for(int index=0;index <arr.length;index++)
		 if(arr[index].length()%2==0) {
			 middchar=arr[index].length()/2-1;
			 ch[index]=arr[index].charAt(middchar);
			 System.out.println(ch);
		 }
		 else {
			 middchar=arr[index].length()/2;
			 ch[index]=arr[index].charAt(middchar);
			 System.out.println(ch);
		 
		}
	 	
	}

	public static void main(String[] args) {
		String [] arr= {"hello","techno","credit"};
		Middlechar middlechar=new Middlechar();
		middlechar.getmiddChar(arr);
		
	}

}
