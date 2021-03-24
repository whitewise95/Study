package step1_03.operator;

//3/18 15:24~ 15:34

public class OpEx06_문제풀기 {
	
	public static void main(String[] args) {
		
		// 예) 3의 배수이면서, 짝수이면 true 출력
		int num = 12;
		System.out.println(num % 3 == 0 && num % 2 == 0);
		
		
		
		// 문제 1) 과락
		// 3과목의 평균이 60점 이상이면, true
		// 단, 어느 한 과목이라도 50점 미만이면, false
		int kor = 100;
		int eng = 87;
		int math = 41;
          System.out.println((kor+eng+math)/3 >= 60 && (kor > 50) && (eng > 50) && (math > 50));
	
          System.out.println();
 
          
          
          
          
		
		// 문제 2) 키가 200cm이상이거나 몸무게가 200kg 이상이면, 입장(true)
		int height1 = 199;
		int weight1 = 199;
      
		int height2 = 200;
		int weight2 = 68;
           System.out.println(height1>=200 || weight1>=200);     
           System.out.println(height2>=200 || weight2>=200);     
		 
		
		
		
		

	}
}
