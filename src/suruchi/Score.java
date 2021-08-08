package suruchi;

// Program for result based on score

class Score{
	
	void displayResult(int score){
		if(score > 50){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
	}
	
	public static void main(String[] a){
		Score score = new Score();
		int studentScore = 52;
		score.displayResult(studentScore);
	}
}