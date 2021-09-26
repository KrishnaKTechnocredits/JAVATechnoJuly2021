package chandani;

class Assignment15a{

	int getElementLengthDiff(String[] arr){
		int sumeven = 0;
		int sumodd = 0;
		for (int index = 0; index< arr.length;index++){
			if(arr[index].length() % 2 == 0)
				sumeven+= arr[index].length();
			else
				sumodd+= arr[index].length();
		}
		return sumeven - sumodd;
	}
	
	
	int processData(){
		String [] arr = new String[4];
		arr[0] = "Maulik";
		arr[1] = "Techno";
		arr[2] = "Nidhi";
		arr[3] = "Ankit";
		return getElementLengthDiff(arr);
	}
	
	public static void main (String[] args){
		Assignment15a assignment15a = new Assignment15a();
		System.out.println("Difference of even length name and odd length name is : " + assignment15a.processData());
	}	
}