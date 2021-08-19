/*program 1*:  wap that will return difference of even length name and odd lenght name.
arr[0] = "Maulik";
		
arr[1] = "Techno";
		
arr[2] = "Nidhi";
		
arr[3] = "Ankit";

output : 2*/
package elizabeth;

class ArrayProgram8{
	
	int differenceOfNameLength(String[] arr){
		int difference=0;
		int evenSum=0;
		int oddSum=0;
		for (int index=0;index<arr.length;index++){
			int ans=arr[index].length();
			if(ans%2==0){
				evenSum=evenSum+ans;
			}else
				oddSum=oddSum+ans;	
		}
		if(evenSum>oddSum){
			difference=evenSum-oddSum;
		}else{
			difference=oddSum-evenSum;
		}	
		return difference;
	}
	
	public static void main(String[] args){
		ArrayProgram8 arrayProgram8=new ArrayProgram8();
		String[] arr ={"Maulik","Techno","Nidhi","Ankit"};
		System.out.println("Difference between even length name and odd length name: ");
		System.out.println(arrayProgram8.differenceOfNameLength(arr));
	}
	
}

