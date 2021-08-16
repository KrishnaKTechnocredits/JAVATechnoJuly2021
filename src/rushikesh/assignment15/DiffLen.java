package rushikesh.assignment15;

public class DiffLen {
	int getDiff(String[] arr){
	int sumEven=0;
	int sumOdd=0;
	for(int index=0;index<arr.length;index++) {
		if(arr[index].length()%2==0) 
			sumEven+=arr[index].length();
		else
			sumOdd+=arr[index].length();
		}
		return sumEven-sumOdd;
}
	
public static void main(String[] args) {
	DiffLen diffLen=new DiffLen();
	String[] arr = {"Maulik","Techno","Nidhi","Ankit"};
	int diff=diffLen.getDiff(arr);
	System.out.print("Difference of even length's name and odd lenght's name is ");
	System.out.println(diff);
	}

}
