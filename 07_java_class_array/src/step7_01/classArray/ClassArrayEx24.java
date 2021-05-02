package step7_01.classArray;

/*
 *  # 싱글턴 패턴
 * 
 *  - 객체를 딱 1번만 생성하여 사용하는 프로그래밍 기법
 */


class MySingleTon {
	// 1) private 기본 생성자를 만든다.
		private MySingleTon(){}
		
		// 2) 내부에서 static으로 자기 자신의 인스턴스를 생성한다.
		private static MySingleTon instance = new MySingleTon();
		
		// 3) instance를 반환할 getter메서드를 만든다.
		public static MySingleTon getInstance() {
			return instance;
		}
		
	
	
	
	// 테스트용 변수 , 메서드 
	int testVar = 100;
	void testMethod() {System.out.println("#테스트 메서드");}
	
}

class NormalClass{
	int s = 0;
	
}



public class ClassArrayEx24 {

	public static void main(String[] args) {
		
		// 일반적인 객체 생성
		System.out.println(new NormalClass()); // 다른객체 
		System.out.println(new NormalClass()); // 다른객체
		System.out.println(new NormalClass()); // 다른객체
		System.out.println();
		
		
		// 싱글턴 객체 생성
		//MySingleTon test = new MySingleTon(); //error 싱글톤패턴 객체는 생성방법은 일반 클래스와 다른다
		System.out.println(MySingleTon.getInstance());  //같은객체
		System.out.println(MySingleTon.getInstance());	//같은객체
		System.out.println(MySingleTon.getInstance());	//같은객체
		System.out.println();
		System.out.println(MySingleTon.getInstance().testVar); 
		MySingleTon.getInstance().testVar = 777;
		System.out.println(MySingleTon.getInstance().testVar); 
		MySingleTon.getInstance().testMethod();
	}

}
