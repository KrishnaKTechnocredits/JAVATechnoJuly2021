package prajwal;

public class Differencebetnno {
	
	int findMaxNo(int[] arr) {
		int Max=arr[0];
		for(int i=0; i<arr.length ; i++) {
		if(Max<arr[i])
		Max=arr[i];
	    }
		int Min=arr[0];
		for(int i=0; i<arr.length; i++)
		{
		if(Min>arr[i])
		Min=arr[i];
		}
		return Max-Min;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Differencebetnno differncebetnno = new Differencebetnno();
		int [] arr= {1,11,44,23,55,99,23};
		System.out.println("Differnce betwn max & minimum no is "+differncebetnno.findMaxNo(arr));

	}

}
