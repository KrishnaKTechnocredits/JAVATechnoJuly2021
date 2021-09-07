package shreya_assignment_27;

import java.util.Arrays;

public class CheckEqualityOfArray1 {
	void isArrayEqual() {
		boolean result=false;
		int[] arr1={10,12,55,32,17};
		int[] arr2={10,12,55,32,17};
		if(arr1.length==arr2.length) {
			for(int index=0;index<arr1.length;index++) {
				if(arr1[index]==arr2[index]) {
					result=true;
				}
			}
		}
		else{
			result=false;
		}
		if(result==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
		
	}
	
	void isArrayEqual1() {
		boolean result=false;
		int[] arr1= {10,12,55,32,17,99};
		int[] arr2={10,12,55,32,17};
		if(arr1.length==arr2.length) {
			for(int index=0;index<arr1.length;index++) {
				if(arr1[index]==arr2[index]) {
					result=true;
				}
			}
		}
		else{
			result=false;
		}
		if(result==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}
		
		
		void isArrayEqual2() {
			boolean result=true;
			int[] arr1=  {10,12,55,32,17};
			int[] arr2={10,12,99,32,17};
			if(arr1.length==arr2.length) {
				for(int index=0;index<arr1.length;index++) {
					if(arr1[index]!=arr2[index]) {
						result=false;
					}
				}
			}
			else{
				result=false;
			}
			if(result==true) {
				System.out.println("Arrays are equal");
			}
			else {
				System.out.println("Arrays are not equal");
			}
		}

	public static void main(String[] args) {
		CheckEqualityOfArray1 checkEqualityOfArray1=new CheckEqualityOfArray1();
		checkEqualityOfArray1.isArrayEqual();
		checkEqualityOfArray1.isArrayEqual1();
		checkEqualityOfArray1.isArrayEqual2();
	}

}
