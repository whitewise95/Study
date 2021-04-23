package step7_01.classArray;

/*
 * 
 * 접근 제어자 : bublic , private + getter/setter
 * 
 * 
 * */

class ModifierTest{
	
	private int a;
	public int b;
	
	
	// private 변수를 클래스 외부로 꺼내주는 메서드 getter
	
	int getA() {
		return this.a;
	}

	// private변수를 클래스 외부에서 수정하는 메서드 setter
	void setA(int i) {
	
		this.a = a;
	}
	
	
}






public class ClassArrayEx17 {

	public static void main(String[] args) {
		
		ModifierTest obj = new ModifierTest(); 
//		// private 변수는 클래스 외부에서 접근 불가
//		obj.a= 1000;
//		System.out.println(obj.a);
		obj.b = 2000;
	
		obj.setA(777);					//setter를 이용하여 private 변수에 값 대입
		System.out.println(obj.getA());   // gettet를 이용하여 출력
		
	}

}
