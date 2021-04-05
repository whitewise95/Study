package step_01.string;


public class StringEx05_문제 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
	
		// 문제 1) 나이 출력
		// 정답 1) 33세
		
		// 문제 2) 성별 출력
		// 정답 2) 여성

		String strAge = jumin.substring(0,2);
		int intAge = Integer.parseInt(strAge);
		int age=2021-(intAge+1900)+1;
		System.out.println(age+"세");
		
	 System.out.println("============================");
		
	 
	 	String strw = jumin.substring(7,8);	
	 	int intw = Integer.parseInt(strw);
		if(intw==2) {
			System.out.println("여성");
		}
		
		
		
		
	}

}
