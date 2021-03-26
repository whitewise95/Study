package step1_06.loop;


//3:25~32

public class LoopEx18_문제 {

	public static void main(String[] args) {
		

		// 문제 1) 1부터 5까지 출력
		// 정답 1) 1, 2, 3, 4, 5
		// i j k l m n
		
		
		for(int x=1; x<6; x++ ) {
			System.out.println(x);
		}
		
		System.out.println();
		

		// 문제 2) 1부터 10까지 반복해 5~9까지 출력
		// 정답 2) 5, 6, 7, 8, 9
		
		for(int x=1; x<11; x++) {
			if(x>=5 && x<10) {
				System.out.println(x);
			}
		}
		
		System.out.println();
		
		// 문제 3) 10부터 1까지 반복해 6~3까지 출력
		// 정답 3) 6, 5, 4, 3
		 for(int x=10; x >0; x-- ) {
			 if(x>2&&x<7) {
				 System.out.println(x);
			 }
		 }
		
		System.out.println();
		

		// 문제 4) 1부터 10까지 반복해 3미만 7이상 출력
		// 정답 4) 1, 2, 7, 8, 9, 10
		for(int x = 1; x<11; x++) {
			if(x<3 || x>6) {
				System.out.println(x);
			}
		}
		
	}

}
