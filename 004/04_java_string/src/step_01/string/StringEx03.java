package step_01.string;

//문자열 관련매서드
// 스페이스바도 문자열에 속함

public class StringEx03 {

	public static void main(String[] args) {
	
		
		String str = "magait";
		System.out.println(str);
		System.out.println("====================================");
		
		
		//[1] 문자열 길이 : length();
		System.out.println(str.length());
		int size = str.length();
		System.out.println(size);
		System.out.println("=====================");		
		
		//[2]문자 한개 추출 (인덱싱) charat(index)
		System.out.println(str.charAt(0));
		char ch = str.charAt(2);  //charAt메서드의 결과는 char 자료형이다.
		System.out.println(ch);
		
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println(str.charAt(str.length()-1));
		
		//[3] 문자 여러개 추출 (슬라이싱) : substring()
		//3-1)  substring(index1이상 , index2미만)
		System.out.println(str.substring(0,4));
		System.out.println(str.substring(4,6));
		String subStr = str.substring(2,4);
		//(중요)substring메서드의 결과는 string자료형이다
		System.out.println(subStr);
		System.out.println();
		
		//3-2) substring(index1부터 끝까지)
		System.out.println(str.substring(2));
		System.out.println(str.substring(4));
		System.out.println("=====================================");
		
		//[4] : 구분자로 잘라내기 : split("구분자")
		
		String str1 = "hello, java";
		String str2 = "hello java programing";
		String str3 = "hello@java@programing@magait";
		
		String[] temp = str1.split(",");
		System.out.println(temp.length);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]+ " ");
		}
		System.out.println();
		
		
		temp = str2.split(" ");
		System.out.println(temp.length);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]+ " ");
		}
		System.out.println();
		
		temp = str3.split("@");
		System.out.println(temp.length);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]+ " ");
		}
		System.out.println();
		// 문자열 비교 : compareTo()
		str1 = "a";  
		str2 = "";
		str3 = "a";
		
		System.out.println(str1.compareTo(str2));   // 왼쪽값(기준값)이 작을 경우 음수가 반환된다
		System.out.println(str2.compareTo(str1));	// 왼쪽값(기준값)이 클 경우 양수가 반환된다
		System.out.println(str1.compareTo(str3));	// 양쪽값이 같을 경우 0이 반환된다
		
		
		
	}

}
