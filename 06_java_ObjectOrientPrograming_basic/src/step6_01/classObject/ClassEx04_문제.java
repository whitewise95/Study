package step6_01.classObject;

import java.util.Random;
import java.util.Scanner;

class Ex04_1 {

	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}
public class ClassEx04_문제 {

	public static void main(String[] args) {
		Ex04_1 e =new Ex04_1();
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);	
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for (int i = 0; i < 5; i++) {
			e.scores[i]=ran.nextInt(100)+1;
			System.out.print(e.scores[i]+", ");
		}
		System.out.println();
	
		
	
		
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		
			int totScore = 0;
			for (int i = 0; i < e.scores.length; i++) {
				totScore += e.scores[i];
			}
			int averageScore = totScore/5;
			System.out.println("총점: "+totScore+" 평균: "+averageScore);
		
		
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
			int cnt =0;
			for (int i = 0; i < e.scores.length;  i++) {
				if(e.scores[i]>=60) {
					cnt++;
				}
			}
			System.out.println(cnt+"명");
		
		
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		System.out.println("인덱스를 입력해주세요 : ");
		int sel = scan.nextInt();
		
		for (int i = 0; i < e.scores.length; i++) {
			if(sel==i) {
				System.out.println("인덱스 :"+i+" 성적 :"+e.scores[i]+"점");
			}
		}
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		System.out.println("성적을 입력해주세요");
		int score = scan.nextInt();
		for (int i = 0; i < e.scores.length; i++) {
			if(e.scores[i]==score) {
				System.out.println("인덱스 : "+i);
			}
		}
		
		
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		System.out.println("학번을 입력주세요 : ");
		int hakbun = scan.nextInt();
		hakbun = hakbun -1001;
		for (int i = 0; i <  e.scores.length; i++) {
			if(hakbun == i) {
				System.out.println("학번 : "+(hakbun+1001)+"성적 : "+e.scores[i]+"점");
			}
		}


		
		
		
		
		
		
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
//		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
	
//		while(true) {
//			int s =0;
//			System.out.println("학번을 입력주세요 : ");
//			hakbun = scan.nextInt();
//			hakbun = hakbun -1001;
//			for (int i = 0; i <  e.scores.length; i++) {
//				if(hakbun == i) {
//					System.out.println("학번 : "+(hakbun+1001)+"성적 : "+e.scores[i]+"점");
//					s++;
//				}
//			}
//			if(s==0) {
//				System.out.println("없는 학번입니다.");
//			}
//		}
//		// 문제8) 1등학생의 학번과 성적 출력
//		// 정답8) 1004번(98점)
//		int first = 0;
//		int firstScore = e.scores[0];
//		
//		for (int i = 0; i < e.scores.length; i++) {
//			if(firstScore<e.scores[i]) {
//				firstScore = e.scores[i];
//				first = e.hakbuns[i];
//			}
//		}
//		System.out.println(first+"번"+"("+firstScore+"점)");
//		
//
//	
	}

}
