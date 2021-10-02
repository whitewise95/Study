package step9_01.OOP_Theory;
/*
 * 
 *  # 인터페이스 (interface)
 *  
 *  - 인터페이스는 추상클래스보다 더 추상화된 클래스
 *  - 실제 구현된 것이 전혀 없는 기본 설계도
 *  - 미리 정해진 규칙에 맞게 구현하도록 '표준'을 제시하는데 사용한다.
 *  - 클래스는 인터페이스를 상속받을 수 없다.
 *  - 인터페이스는 클래스를 상속받을 수 없다.
 *  - 클래스는 클래스끼리 , 인터페이스는 인터페이스끼리 상속시킬 수 있다.
 *  - 클래스는 다중 상속을 허용하지않지만 인터페이스는 다중구현을 허용한다.
 *  
 * */
abstract class AA{//추상클래스 
	
	abstract void test1();  		//추상메소드
	void test2() {					//일반메서드
		System.out.println("test2");
	}
}

interface BB { //인터페이스 
	
	abstract void test3();  //추상메서드
	abstract void test4(); 
	
	// 인터페이스에서는 일반 메서드를 사용할 수 없다.
	
//	void test5() {
//		System.out.println("test5");
//	}
	
}
interface CC  {
	
	void test5();  // 인터페이스에서 abstract 키워드를 생략할 수 있다.
	void test6();
}



// implemets 키워드를 사용하여 인터페이스를 '구현' 한다 (상속x)
class DD extends AA implements BB, CC{ //인터페이스는 다중구현이 가능하다.

	
	@Override
	void test1() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test6() {
		// TODO Auto-generated method stub
		
	}


	
}



public class OOPEx06 {

	public static void main(String[] args) {
	
		
		
	}

}
