package prajwal;

public class ReverseString {
	String output="";
	String getReverseString(String arr)
	{
	for(int i=arr.length()-1; i>=0;i-- ) 
	{
		output=output+ arr.charAt(i);
	}
	 	return output;
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
    ReverseString reversestring=new ReverseString();
    System.out.println(""+ reversestring.getReverseString("technocredits"));
	}

}
