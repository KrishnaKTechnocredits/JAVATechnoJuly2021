package anuja;

public class Assignment15 {
	
	int length1;
	int sum,sum1,l,index,evensum,oddsum,diff;
	
	void length(String arr[]) {
		for(int i=0;i<arr.length;i++) {
			length1=arr[i].length();
			System.out.println(arr[i].length());
				if(length1%2==0)
				 sum+=length1;
				else 
				sum1+=length1;
		}
			System.out.println("Difference of even length name and odd length name is "+ (sum-sum1));
	}
	
	void middleChar(String[] input) {
		
		for(int i=0;i<input.length;i++) {
			char[] output=new char[input.length];
			//output[i]=input[i];
			l=input[i].length();
			if(l%2==0) {
				index=l/2;
				//   System.out.println("Middle character of "+input[i]+ " is "+ input[i].charAt(index));
				output[i]= input[i].charAt(index);
				//System.out.println(output);
			}
			else {
				index=(l-1)/2;
				//System.out.println("Middle character of "+input[i]+ " is "+ input[i].charAt(index));
				output[i]= input[i].charAt(index);
				//System.out.println(output);
			}
			output[i]= input[i].charAt(index);
			System.out.print(output);
			
		}
		System.out.println(" ");
		
	}
	
	void diff(int[] techno) {
		for(int i=0;i<techno.length;i++) {
			if(techno[i]%2==0)
				evensum+=techno[i];
			else
				oddsum+=techno[i];
		}
		if(evensum>oddsum)
			diff=evensum-oddsum;
		else
			diff=oddsum-evensum;
			System.out.println("Difference between sum of even nos-sum of odd nos is "+ diff);
	}
	
	public static void main(String[] args) {
		Assignment15 assignment15=new Assignment15();
		String[] arr=new String[4];
		arr[0]="Maulik";
		arr[1]="Techno";
		arr[2]="Nidhi";
		arr[3]="Ankit";
		String[] input= {"hello","techno","credits"};
		int[] techno= {12,2,13,9};
		assignment15.length(arr);
		assignment15.middleChar(input);
		assignment15.diff(techno);
	}
}
