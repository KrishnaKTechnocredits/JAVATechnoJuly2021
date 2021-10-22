package suchita.Assignment51;
// Assignment 51

//Builder test class

import java.util.Comparator;

public class BuilderTest implements Comparator<Builder> {

	@Override
	public int compare(Builder obj1, Builder obj2) {
		
		return obj1.revenue - obj2.revenue;
	}

}