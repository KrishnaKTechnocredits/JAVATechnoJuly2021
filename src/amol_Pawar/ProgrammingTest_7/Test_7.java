package amol_Pawar.ProgrammingTest_7;

public class Test_7 {

	void getCountNumTriples(int[] input)
	{
		
		int count=0;
		int num=0;
		for(int index=0;index<input.length;index++)
		{
			if(index<input.length-2) {
			if(input[index]<input[index+1] && input[index+1]<input[index+2])
			{
				count++;
				num=index;
				break;
			}
			}
			
		}
		System.out.println(input[num]+","+input[num+1] +","+input[num+2]+" is triple which is in increasing order having count as "+count);
	}
	public static void main(String[] args) {
		Test_7 test_7=new Test_7();
		int arr[]={10,9,11,6,23,25,22,66,34};
		test_7.getCountNumTriples(arr);
		

	}

}
