package step9_01.OOP_Theory;

// 클래스의 형변환 (업 다운 캐스팅)
class Base{
	void baseMethod() {}
	
}

class Sub extends Base {
	void subMethod() {}
}





public class OOPEx09 {

	public static void main(String[] args) {
		
		Base base1 = new Base();  // 부모 클래스의 객체 생성
		base1. baseMethod();       // 자신의 메서드 사용
		
		
		Sub sub1 = new Sub();	  //자식 클래스의 객체 생성
		sub1.baseMethod();		  //상속받은 메서드 사용
		sub1.subMethod();         //자신의 메서드 사용
		
		System.out.println("===================================");
		/*
		
		[1] base 변수는 new 할때 Base에 있는 자원만 생성된다. 
		[2] 반면 sub 변수는 new 할때 Base 와 Sub 의 자원이 둘다 생성된다. 결국, 
		[3] sub은 Base 로 형변환이 가능하고, 		
		[4] base 는 Sub 으로 형변환이 불가능하다.	
	
    */	
		
		Base sub2 = new Sub();
		sub2.baseMethod();			// 객체의 타입 부모형태이기 때문에 부모클래스가 가지고 있는 메서드만 사용가능
		//Sub base = new Base();
		
		// [참고] instanceof : 형변환이 가능한지 확인하는 메서드
				if (sub1 instanceof Base) System.out.println("형변환 가능1");
				else					  System.out.println("형변환 불가1");
				
				System.out.println();
				
				if (base1 instanceof Sub) System.out.println("형변환 가능2");
				else					  System.out.println("형변환 불가2");
				
		
		
	}

}
