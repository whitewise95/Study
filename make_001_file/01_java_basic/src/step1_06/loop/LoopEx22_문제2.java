package step1_06.loop;


// # 삼각형 그리기
// 20:00~20:43
public class LoopEx22_문제2 {
	
	public static void main(String[] args) {
		
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		

		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		
		System.out.println("=========================");
		
		
   
		/*
		 * 문제 2)
		 *   #
		 *  ##
		 * ###
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 2; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println("=========================");

		
    
		
		/*
		 * 문제 3)
		 * ###
		 * ##
		 * #
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("=========================");

		
		/*
		 * 문제 4)
		 * ###
		 *  ##
		 *   #
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 3; j > i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		
		
		System.out.println("=========================");

		
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */
           
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			for (int j = 2; j > i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
           
           
           

		System.out.println("=========================");
		
		/*
		 * 문제 6)
		 *   #
		 *  ###
		 * #####
		 */
		int c = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 2; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < c; j++ ) {
				System.out.print("#");
		
			}
			c++;
			System.out.println();
			c++;
		}
           
		System.out.println("=========================");

		/*
		 * 문제 7)
		 *  #####
		 *   ###
		 *    #
		 */
		c= 5;
		for (int i = 1; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < c; j++) {
				System.out.print("#");
			}
			c--;
			c--;
			System.out.println();
		}
	}
}
