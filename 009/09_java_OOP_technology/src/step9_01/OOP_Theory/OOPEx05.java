package step9_01.OOP_Theory;
/*
 *  # 추상화 
 * 
 * - 부모클래스를 상속받은 자식클래스에게 반드시 구현해야하는 메서드를 잊지않고 만들도록 '강제'하는 클래스
 * - 다중 상속이 불가능하다.
 * 
 */

// 일반 클래스 1
class Parent1 {
	void test() {}
}

// 일반 클래스를 상속 받은 일반 클래스 
class Child1 extends Parent1 {}


// 추상 클래스 
abstract class Parent2 { // abstract 키워드를 클래스 앞에 붙여준다.
	
	/*
	 * 추상 메서드
	 * 
	 * - abstract 키워드를 메소드 앞에 붙여준다.
	 * - 추상 메소드는 추상클래스 안에서 선언만 하고 
	 * 	 실질적인 메소드의 구연은 추상클래스를 상속받은 일반 자녀 클래스에서 진행한다.
	 * -추상메서드 뒤에 '{}' 아닌 ';' 를 붙인다.
	 * 
	 * */
	
	abstract void test1();
	abstract void test2();
	abstract void test3();
	abstract void test4();
	abstract void test5();
	abstract void test6();
	
	void test99() { // 추상클래스에서는 일반메서드도 같이 사용이 가능하다. 
		System.out.println("일반 메소드");
	}
	
}

// 추상클래스를 상속받은 일반 클래스
class Child2 extends Parent2{

	@Override
	void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void test3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void test4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void test5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void test6() {
		// TODO Auto-generated method stub
		
	}
	
}
// 추상클래스 상속받은 일반 클래스

class Child3 extends Parent2 {

	@Override
	void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void test3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void test4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void test5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void test6() {
		// TODO Auto-generated method stub
		
	}
	
}



public class OOPEx05 {

	
	public static void main(String[] args) {
		
		new Parent1();
		new Child1();
		//new Parent2(); // 추상클래스는 객체를 생성 할 수 없다.
		
		new Child2();
		new Child3();
		
	}

}
