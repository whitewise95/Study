package step9_02.score.copy;

import step9_02.score.ScoreVO;

public class Main {

	public static void main(String[] args) {
		
		ScoreList scoreList = new ScoreList();
		
		scoreList.(new ScoreVO("홍길동", 100, 100, 99));
		scoreList.scores_add(new ScoreVO("임꺽정", 88, 75, 91));
		scoreList.scores_add(new ScoreVO("장길산", 65, 74, 69));
		scoreList.scores_add(new ScoreVO("일지매", 85, 78, 92));
		scoreList.scores_add(new ScoreVO("이몽룡", 89, 58, 73));
		
	
	}
}
