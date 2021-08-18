package laxman;

public class Assignment13 {
		
	int getPositiveNumber(int[]input){
		int count=0;
		for (int index=0;index <input.length;index++){
			
			if(input[index]>0) {
				count++;
			}
		}
			System.out.println("The count of positive number is "+ count );
			return count;
	}
	int getCountNumber0(int[]input){
		int count=0;
		for (int index=0;index <input.length;index++){
			
			if(input[index]==0) {
				count++;
			}
		}
			System.out.println("The count of zero is "+ count );
			return count;
	}
	void smallNumber(int input){
		int [] num = new int[5];
		for (int index=0;index<5;index++){
			 input--;
			 num[index]=input;
			 System.out.println(num[index] );
			 
		}
	}
		
	

		public static void main(String[]args) {
			Assignment13 assignment13 =new Assignment13();
			int [] arr = new int[8];
			int [] num = new int[8];
			arr[0]=1;
			arr[1]=-11;
			arr[2]=-44;
			arr[3]=23;
			arr[4]=55;
			arr[5]=-99;
			arr[6]=-23;
			arr[7]=-22;
			num[0]=1;
			num[1]=-11;
			num[2]=0;
			num[3]=0;
			num[4]=55;
			num[5]=0;
			num[6]=-23;
			num[7]=0;
	
			assignment13.getPositiveNumber(arr);
			assignment13.getCountNumber0(num);
			assignment13.smallNumber(50);
	
	 }
}
		
	