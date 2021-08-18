package purshottamJoshi;

class Program2{
	
	char[] getMiddlecharacter(String[] arr) {
		char[] output=new char[arr.length];
		for(int index=0;index<arr.length;index++) {
			int length = arr[index].length();
			if (length % 2 == 0) {
				int middleChar = (length/2)-1;
				output[index]=arr[index].charAt(middleChar);
			}
			if(length % 2 !=0) {
				int middleChar = (length/2);
				output[index]=arr[index].charAt(middleChar);
			}
		}
		return output;
	}

	public static void main(String[] args){
		Program2 program2=new Program2();
		String[] str = {"hello","techno","credits"};
		char[] output = new char[str.length];
		output = program2.getMiddlecharacter(str);
		for(int index = 0; index<str.length; index++) {
		System.out.println("Middle charater of " +str[index]+ " is " +output[index]);
		}
	}
}