package technocredits1.oops;

import java.io.FileNotFoundException;
import java.io.IOException;

import technocredits1.exception.AgeNotValidException;

public class A {

	void m1() throws AgeNotValidException{
		System.out.println("Hi");
		throw new AgeNotValidException("Age is not valid");
	}
	
	public static void main(String[] args) {
		try {
			new A().m1();
		}
		catch(AgeNotValidException e) {
			System.out.println(e.toString());
		}
	}
}
