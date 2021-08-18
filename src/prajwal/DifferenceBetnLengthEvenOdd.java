package prajwal;

public class DifferenceBetnLengthEvenOdd {
	int Sum=0;
	int Sum2=0;
	
	int differenceBetnLengthEvenOdd(String [] arr) 
	{
		for (int i=0; i<arr.length; i++)
		if(arr[i].length() %2==0)
		{
			Sum= Sum+arr[i].length();
		}
		else
		{
			Sum2= Sum2+arr[i].length();
		}
		return Sum-Sum2;
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	DifferenceBetnLengthEvenOdd difference= new DifferenceBetnLengthEvenOdd();
    String[] arr= {"Maulik", "Techno","Nidhi","Ankit"};
    System.out.println("Differnce between length of Even and Odd number is " +difference.differenceBetnLengthEvenOdd(arr));
}

}
