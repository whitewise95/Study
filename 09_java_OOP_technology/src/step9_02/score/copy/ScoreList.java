package step9_02.score.copy;

import java.util.ArrayList;

class ScoreList {
	
	ArrayList<ScoreVO> scores = new ArrayList<>();
	
	@Override
	public String toString() {
	String str ="";
	int tot;

	str += "===============================================================\n";
	str += "  번호  이름  java  jsp  spring  총점  평균  석차  \n";
	str += "===============================================================\n";
	for (int i = 0; i < scores.size(); i++) {
		str = scores.get(i).toString();
		
	}
	str += "===============================================================\n";
	
	return  str;
	}
	
	
	
	
	public void scores_add(ScoreVO temp) {
		scores.add(temp);
	
	}
}

	









