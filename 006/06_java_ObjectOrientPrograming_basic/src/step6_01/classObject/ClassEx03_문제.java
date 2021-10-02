package step6_01.classObject;



//# 학생성적관리 프로그램[1단계] : 클래스 + 변수
// 풀기시작 1:18~1:30
  class Ex03_1{
	int[] arr = {87, 100, 11, 72, 92};
}



public class ClassEx03_문제 {

	public static void main(String[] args) {
		
		Ex03_1 e =  new Ex03_1();
		
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		int sum = 0;
		int x = 0;
		int cnt = 0;
		int X  =0;
		
			for (int i = 0; i < e.arr.length; i++) {
				sum += e.arr[i];
				if(e.arr[i]%4==0) {
					x+=e.arr[i];
					cnt++;
				}
			
			}
			System.out.println(sum);
		System.out.println();
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
			System.out.println(x);
			
			
		
		System.out.println();
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		System.out.println(cnt);
			
		System.out.println();
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		for (int i = 0; i < e.arr.length; i++) {
			 if(e.arr[i]%2==0) {
				X++;
			}
		}
		System.out.println(X);
	}

}
