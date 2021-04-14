package step6_02.method;

import java.util.Scanner;

class Ex05_1{

	void test1() {
		int sum = 0;
		for (int i = 0; i < 6; i++) {
			sum+=i;			
		}
		System.out.println(sum);
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		int i = 0;
		while(i<3) {
		System.out.println("정수를 입력해주세요");
		arr[i] =scan.nextInt();
		i++;
		}
		int temp = arr[0];
		if(temp < arr[1]) {temp=arr[1];}
		if(temp < arr[2]) {temp=arr[2];}
		System.out.println(temp);
		scan.close();
	}
	
}


public class MethodEx05_문제 {

	public static void main(String[] args) {

	
			Ex05_1 e = new Ex05_1();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			e.test1();
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			e.test2();
		


	}

}
