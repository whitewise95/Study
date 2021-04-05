package step_01.string;

//문자열 관련 데이터 형변환

public class stringEx04 {

	public static void main(String[] args) {

		// [1]문자열 > 숫자 형변환
		String sNum = "10";
		System.out.println(sNum+1);                         //101
		int nNum = Integer.parseInt(sNum);					//Integer.parseInt("문자열")메서드 사용
		System.out.println(nNum+1);							//11
		
		System.out.println("===========================");
		
		
		//[2]숫자 > 문자열 형변환
		
		//2-1) +"" 사용
		String str1 = nNum+"";
		System.out.println(str1+1);
		
		
		//2-2) Integer.toSting(숫자) 메서드 기능
		String str2 = Integer.toString(nNum);
		System.out.println(str2+1);//101
		
		
		//2-3) String.valueOf(숫자) 사용
		String str3 = String.valueOf(nNum);
		System.out.println(str3+1); //101
		
	}

}
