package step1_06.loop;

/*
 * 
 *  # 삼각형 출력하기
 * 
 *         1
 *        2 2 
 *       3 3 3
 *      4 4 4 4
 *     5 5 5 5 5
 *    6 6 6 6 6 6 
 *   7 7 7 7 7 7 7
 *  8 8 8 8 8 8 8 8
 * 9 9 9 9 9 9 9 9 9 
 * 
*/

public class LoopEx28_테스트문제 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			for (int k = 10; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
			
				for (int k = i; k <= i; k++) {
					System.out.print(k+" ");
				}
			}
			System.out.println();
		}
	}

}
