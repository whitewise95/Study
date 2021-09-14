package step_01.string;

/*
 * 
 * 문제) 전체 성적(총점)이 1등인 학생 이름 출력
 * 
 *  학생 정보와 성적이 담긴 데이터 이다 
 * 	student => 1.이름 2.주소 3.번호
 *  score   => 1.번호 2.국어 3.수학 4.영어 점수
 *  
 *  
 * */

public class StringEx19_테스트문제 {

	public static void main(String[] args) {
		
		String [][] students = {
								 {"제임스 고슬링","신촌","1001"}, 
								 {"스티브워즈니악","강남","1002" },
								 {"데니스리치" ,"대치", "1003"}, 
								 {"팀버너스리" , "강동","1004"}
							  };
		
		String[][] scores = {
								{"1001" ,"100" ,"20" , "30"},
								{"1002" ,"10" ,"60" , "60"},
								{"1003" ,"23" ,"63" , "31"},
								{"1004" ,"45" ,"30" , "35"},
							};
		
		
		String[][] sum = new String[4][2];
		
		
		for (int i = 0; i < students.length; i++) {
			sum[i][0] = students[i][0];
			int temp = 0;
			for (int j = 1; j < scores[i].length; j++) {
				 temp += Integer.parseInt(scores[i][j]);
				
			}
			 sum[i][1] =Integer.toString(temp);
		}
		
		int max = Integer.parseInt(sum[0][1]);
		
		for (int i = 0; i < sum.length; i++) {
			int temp = Integer.parseInt(sum[i][1]);
				if(max < temp) {
					max = temp;
				}
			
		}
		
		String temp = Integer.toString(max);
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				if(sum[i][j].equals(temp)) {
					System.out.print("전체 성적(총점)이 1등인 학생 이름 :");
					System.out.print(sum[i][0]);
				}
			}
		}
		 

	}

}
