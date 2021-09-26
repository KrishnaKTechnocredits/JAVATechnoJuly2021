package nidhi;

/**
Program 3: 
int[] arr = {10,23,24,25,26,61,62,64,69,66};
output : 3
Note : 23,24,25
       24,25,26
	   64,65,66 **/
	   
class Assignment_31_Program3{
	
	int countTriplets(int[] num){
		int cnt=0;
		for (int i=0; i < num.length-2; i++){
			if (num[i+1] == num[i]+1){
				if (num[i+2] == num[i]+2)
					cnt++;
				
			}		
		}
			return cnt;
	}
	
	public static void main(String[] arg){
		Assignment_31_Program3 assignment31 = new Assignment_31_Program3();
		int[] arr = {10,23,24,25,26,61,62,64,65,66};
		System.out.println(assignment31.countTriplets(arr));
		
	}

}