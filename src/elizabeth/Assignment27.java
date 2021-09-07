/*Assignment - 27 : 2nd Sep'2021

 WAP to find 2 arrays are identical or not. 
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,55,32,17}};
output : Identical
--------------------------------------------
int[] arr1 = {10,12,55,32,17,99};
int[] arr2 = {10,12,55,32,17}};
output : Not identical
------------------------------------
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,99,32,17}};
output : Not Identical*/
package elizabeth;

class Assignment27{
	
	void getOutput(int[] arr1, int[] arr2){
		boolean flag=false;
		if(arr1.length==arr2.length){
			for(int index=0;index<arr1.length;index++){
					if(arr1[index]==arr2[index]){
						flag=true;
					}else{
						flag=false;
						break;
					}
			}
		}else{
			flag=false;
		}
		if(flag){
			System.out.println("Identical");
		}else{
			System.out.println("Not Identical");
		}
	}
	
	public static void main(String[] args){
		Assignment27 assignment27=new Assignment27();
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,55,32,17};
		assignment27.getOutput(arr1,arr2);
		int[] arr3 = {10,12,55,32,17,99};
		int[] arr4 = {10,12,55,32,17};
		assignment27.getOutput(arr3,arr4);
		int[] arr5 = {10,12,55,32,17};
		int[] arr6 = {10,12,99,32,17};
		assignment27.getOutput(arr5,arr6);
	}
}