package step_01.string;


public class StringEx05_문제 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
	
		// 문제 1) 나이 출력
		// 정답 1) 33세
		
		// 문제 2) 성별 출력
		// 정답 2) 여성

		String[] temp =jumin.split("-");
		String sAge = jumin.substring(0,2);
		int iAge = Integer.parseInt(sAge);
		System.out.println(2021-1900-iAge+1);
		
		System.out.println("===============================");
		
		char mW = jumin.charAt(7);
		if(mW == '2'||mW =='4') {
			System.out.println("여성");
		}
		if(mW =='1'||mW =='3') {
			System.out.println("남성");
		}
		
		
		
		
		
		
		
	}

}
