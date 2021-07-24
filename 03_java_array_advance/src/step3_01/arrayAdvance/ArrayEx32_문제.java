package step3_01.arrayAdvance;

/*
 * # 석차 출력
 * 
 * . 성적 순으로 이름 출력
 */

public class ArrayEx32_문제 {
	public static void main(String[] args) {

		String[] names = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
		int[] scores   = {    87,    42,    100,     11,     98};
		int x = 0;
		
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = i; j < scores.length; j++) {
				if(scores[i]<scores[j]) {
					String sTemp = names[i];
					 names[i]= names[j];
					 names[j]=sTemp;
					int iTemp =scores[i];
					scores[i] = scores[j];
					scores[j] = iTemp;
				}
			}
		}
		for (int i = 0; i < scores.length; i++) {
			System.out.print(names[i]);
			System.out.print(",");
			System.out.print(scores[i]);
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}
}
