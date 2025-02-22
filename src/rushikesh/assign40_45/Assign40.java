package rushikesh.assign40_45;
/*
 Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3
 */
public class Assign40 {
	void getNumbers(String ip) {
		String arr[]=new String[ip.length()];
		arr=ip.split(" ");
		for(int i =0;i<arr.length;i++) {
			
			try {
				int num=Integer.parseInt(arr[i]);
				System.out.println(num);
			}catch(NumberFormatException ne) {	
			}
			
		}
	
	}
	public static void main(String[] args) {
		Assign40 assign40=new Assign40();
		assign40.getNumbers("I have 15 years and 9 months of exp");
	}
	
}
