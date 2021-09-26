package siddharth;

public class Assignment13_3{
	void return5Numbers(int value) {
        int[] input = new int[5];
        for (int index = 0; index < 5; index++) {
            value--;
            input[index] = value;
            System.out.println(input[index]);
        }
    }

 

    public static void main(String[] args) {
        Assignment13_3 program3 = new Assignment13_3();
        program3.return5Numbers(50);
    }
}
