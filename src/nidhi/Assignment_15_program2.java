package nidhi;

class Assignment_15_program2{
	
	void midChar(String arr[]){
		
		for (int i=0; i < arr.length ; i++){
			if (arr[i].length() % 2 == 0) {
				System.out.println("Middle character of " + arr[i] + " is " + arr[i].charAt((arr[i].length() - 1)/2));
			}
			else {
				System.out.println("Middle character of " + arr[i] + " is " + arr[i].charAt(arr[i].length()/2));
			}
		}
	}
	
	public static void main(String[] args){
		Assignment_15_program2 assignment15= new Assignment_15_program2();
		String[] str = {"hello","techno","credits"};
		assignment15.midChar(str);
	}
}