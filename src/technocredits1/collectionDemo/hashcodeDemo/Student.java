package technocredits1.collectionDemo.hashcodeDemo;

public class Student {
	String name;
	int age;
	
	Student(String name, int age){
		this.age = age;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		int code = 0;
		char[] arr = this.name.toCharArray();
		for(char ch : arr) {
			code += ch;
		}
		code = code & 15; // 0-15
		return code;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s1 = (Student)obj;
		return this.name.equals(s1.name) && this.age == s1.age;
	}
}
