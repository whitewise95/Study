package step3_01.arrayAdvance;
/*
 * # 정렬하기
 * 
 * 1. 인덱스 0번이 나머지를 검사한다.
 * 2. 제일 큰 값을 찾아 교환한다.
 * 3. 인덱스 1증가한다.
 * 4. [1~3]을 끝까지 반복한다.
 * 예)
 * 10, 50, 30, 40, 80, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 40, 30, 10, 7
 */


public class ArrayEx31_문제 {

	public static void main(String[] args) {
		
	
		int[] temp = new int[5];
		int cnt =0;
		
		while(cnt<3) {
			int[] scores = {10, 50, 30, 40, 80, 7};
			int i =0;
			int index =0;
			while(i<5){
				int max =0;
				for (int j = 0; j < 5; j++) {
					if(max < scores[j]) {
						max = scores[j];
						
					}
				}
				temp[index] = max;
				index++;
				i++;
				for (int j = 0; j < scores.length; j++) {
					if(max==scores[j]) {
						scores[j] = 0;
					}
				}
			}
			cnt++;
		
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]+",");
		}
		
		
		
	}

}
