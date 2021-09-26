package chirag.assignment27;

import java.util.Arrays;

//int [] ={10,12,55,32,17};
//int [] {10,12,55,32,17}};
//output:identical

//int [] ={10,12,55,32,17,99};
//int [] {10,12,55,32,17}};
//output:not identical

//int [] ={10,12,55,32,17};
//int [] {10,12,99,32,17}};
//output:not identical


public class FindIdenticalArray {
	
	void arrayIsidenticalOrNot(int [] arr1,int [] arr2) {
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Array "+Arrays.toString(arr1)+" and "+Arrays.toString(arr2));
			System.out.println("Identical Arrays");
		}
		else {
			System.out.println("Array "+Arrays.toString(arr1)+" and "+Arrays.toString(arr2));
			System.out.println("Not Identical Arrays");
		}
	}
	public static void main(String[] args) {
		FindIdenticalArray findIdenticalArray=new FindIdenticalArray();
		int [] a = {10,12,55,32,17};
		int [] b= {10,12,55,32,17};
		findIdenticalArray.arrayIsidenticalOrNot(a,b);
		System.out.println("-----------------------------------------------------");
		int [] x ={10,12,55,32,17,99};
		int [] y ={10,12,55,32,17};
		findIdenticalArray.arrayIsidenticalOrNot(x, y);
		System.out.println("-----------------------------------------------------");
		int [] p ={10,12,55,32,17};
		int [] q= {10,12,99,32,17};
		findIdenticalArray.arrayIsidenticalOrNot(p, q);
	}

}
