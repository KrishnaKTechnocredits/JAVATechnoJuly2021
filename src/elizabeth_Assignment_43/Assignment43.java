//To find Length of a string without using length as menthod and property:

package elizabeth_Assignment_43;

class Assignment43{
	
	void getLength(String str){
		int count=0;
		while(true){
			try{
				str.charAt(count);
				count++;
			}catch(StringIndexOutOfBoundsException se){
				break;
			}
		}
		System.out.println(str+":" +count);
	}
	
	public static void main(String[] args){
		Assignment43 assignment43=new Assignment43();
		assignment43.getLength("technocredits");
		assignment43.getLength("eliza");
	}
}


