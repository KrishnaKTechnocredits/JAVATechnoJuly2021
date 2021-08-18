package prajwal;

public class Minimumnumber {
	
	int minimumno(int[] arr) {
		int Min=arr[0];
		for(int i=0; i<arr.length; i++)
		{
		  if(Min>arr[i])
		  Min=arr[i];
		}
		 return Min ;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Minimumnumber minimumnumber= new Minimumnumber();
		int[] arr= {101,11,44,23,55,99,23};
		System.out.println("Minimum no is "+minimumnumber.minimumno(arr));
		}

}
