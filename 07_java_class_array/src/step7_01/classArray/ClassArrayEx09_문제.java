package step7_01.classArray;

import java.util.Random;

// 중복숫자금지 [문제]


class RanNum{
	int num;
}


public class ClassArrayEx09_문제 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		// 문제) RanNum 클래스를 활용해서 중복숫자금지 출력 
		//      num에 1~5사이숫자를 랜덤으로 저장한다. (조건 중복숫자금지)
		
		RanNum[] arr = new RanNum[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new RanNum();
		}
		for (int i = 0; i < arr.length; i++) {
			int number = ran.nextInt(5)+1;
			
			int check = 1;
			
			for (int j = 0; j < i; j++) {
				if(arr[j].num == number) {
					check = -1;
				}
				
			}
			if(check==1) {
				arr[i].num = number;
			}
			else {
				i--;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].num+", ");
		}



	}

}
