package score;

public class ScoreDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score score = new Score();
		score.add(90);
		score.add(80);
		score.add(70);
		
		System.out.println(score.max());
		System.out.println(score.mean());

	}

}
