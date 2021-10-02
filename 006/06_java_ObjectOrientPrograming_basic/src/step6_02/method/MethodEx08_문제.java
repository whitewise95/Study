package step6_02.method;


class Ex08_1 {
	
	void printSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			
		}
		System.out.println(sum);
	}
	void printSumMultiple4(int[] arr) {
		int sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%4==0) {
				sum1+=arr[i];
			}
		}
		System.out.println(sum1);
	}
	void printCountMultiple4(int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%4==0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}


public class MethodEx08_문제 {

	public static void main(String[] args) {
		
		Ex08_1 e = new Ex08_1();
		
		int[] arr = { 87, 100, 11, 72, 92 };

		// 문제 1) arr요소의 전체 합을 출력하는 메서드
		// 정답 1) 362
		e.printSum(arr);
		// 문제 2) 4의 배수의 합을 출력하는 메서드
		// 정답 2) 264
		e.printSumMultiple4(arr);
		// 문제 3) 4의 배수의 개수를 출력하는 메서드
		// 정답 3) 3
		e.printCountMultiple4(arr);
		

	}

}
