package step1_06.loop;

import java.util.Random;

/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

public class LoopEx15_문제 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int i = 1;
		int randomNumber1=0;
		int randomNumber2=0;
		int randomNumber3=0;
		int randomNumber4=0;
		int randomNumber5=0;
		
		
		
		while(i<6) {
				if(i==1) {
					int randomNumber = ran.nextInt(100)+1;
					i++;
					randomNumber1 = randomNumber;
					 if(randomNumber1>=60){
						 System.out.println("randomNumber1:"+randomNumber1+"합격");
					 }
			 
			 
			
		}
				else if(i==2) {
					int randomNumber = ran.nextInt(100)+1;
					i++;
					randomNumber2 = randomNumber;
					 if(randomNumber2>=60){
						 System.out.println("randomNumber2:"+randomNumber2+"합격");
					 }
			 
			 
			
		}
				else if(i==3) {
					int randomNumber = ran.nextInt(100)+1;
					i++;
					randomNumber3 = randomNumber;
					 if(randomNumber3>=60){
						 System.out.println("randomNumber3:"+randomNumber3+"합격");
					 }
			 
			 
			
		}
				else if(i==4) {
					int randomNumber = ran.nextInt(100)+1;
					i++;
					randomNumber4 = randomNumber;
					 if(randomNumber4>=60){
						 System.out.println("randomNumber4:"+randomNumber4+"합격");
					 }
			 
			 
			
		}
				else if(i==5) {
					int randomNumber = ran.nextInt(100)+1;
					i++;
					randomNumber5 = randomNumber;
					 if(randomNumber5>=60){
						 System.out.println("randomNumber5:"+randomNumber5+"합격");
					 }
			 
			 
			
		

			 
			 
			
		}
				
			 
			
		}
		System.out.println("평균 :"+(randomNumber1+randomNumber2+randomNumber3+randomNumber4+randomNumber5)/5);
		if(randomNumber1>=60) {
		System.out.println("합격자:"+"randomNumber1:"+randomNumber1);	
		}
		if(randomNumber2>=60) {
			System.out.println("합격자:"+"randomNumber2:"+randomNumber2);	
		}
		if(randomNumber3>=60) {
			System.out.println("합격자:"+"randomNumber3:"+randomNumber3);	
		}
		if(randomNumber4>=60) {
			System.out.println("합격자:"+"randomNumber4:"+randomNumber4);	
		}
		if(randomNumber5>=60) {
			System.out.println("합격자:"+"randomNumber5:"+randomNumber5);	
		}
		}
	  
		
		
	}


