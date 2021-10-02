package step9_02.score;

public class Main {

	public static void main(String[] args) {
		
		ScoreList scoreList = new ScoreList();
		
		scoreList.addScore(new ScoreVO("홍길동", 100, 100, 99));
		scoreList.addScore(new ScoreVO("임꺽정", 88, 75, 91));
		scoreList.addScore(new ScoreVO("장길산", 65, 74, 69));
		scoreList.addScore(new ScoreVO("일지매", 85, 78, 92));
		scoreList.addScore(new ScoreVO("이몽룡", 89, 58, 73));
		
		System.out.println(scoreList);
		
	}
	
}
