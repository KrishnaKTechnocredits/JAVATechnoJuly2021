package atul_K.Assignments.Ass15;

public class Program1 {

	int getdiff(String[] arr) {
		int evenCnt = 0;
		int oddCnt = 0;
		for(int index=0; index<arr.length;index++) {
			if(arr[index].length()%2 ==0) {
				evenCnt+=arr[index].length();
			} else {
					oddCnt+=arr[index].length();
					}
			}
		if(evenCnt > oddCnt)
			return  evenCnt-oddCnt;
		else
			return  oddCnt-evenCnt;
		}	
	public static void main(String [] args) {
		String[] arr = {"maulik","Techno", "Nidhi", "Ankit"};
		Program1 p1 = new Program1();
		System.out.println(p1.getdiff(arr));
	}
	}