package step7_01.classArray;

/*

# static

- 정적 필드와 정적 메소드는 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 고정된 멤버이다.
- static 키워드를 통해 생성된 정적멤버들은 Heap영역이 아닌 Static영역에 할당한다.
- Static 영역에 할당된 메모리는 모든 객체가 공유하여 하나의 멤버를 어디서든지 참조할 수 있다.
- Garbage Collector의 관리 영역 밖에 존재하기에 Static영역에 있는 멤버들은 프로그램의 종료시까지 메모리가 할당된 채로 존재한다.

*/

class Character{
	
	int level 				= 1;
	int hp					= 100;
	static int moveSpeed	= 5;
	
	void showStatus() {
		System.out.println("leve : "+level);
		System.out.println("hp : "+hp);
		System.out.println("moveSpeed : "+moveSpeed);
	}
	
	static void speedUp() {
		moveSpeed += 100;
	}
	
	
	
}




public class ClassArrayEx18 {

	public static void main(String[] args) {
		
		Character e1 = new Character();
		e1.hp = 0;
		//static변수는 클래스명.static변수명으로 접근한다
		Character.moveSpeed = 50;
		
		// static메서드는 클래스명.static메서드명()으로 접근한다.
		Character.speedUp();
		
		//e1.moveSpeed +=50;
		e1.showStatus();
		
		
		
		
		Character e2 = new Character();
		e2.moveSpeed += 500;
		e2.hp = 50;
		e2.showStatus();
		
		
		
		
		Character e3 = new Character();
		e3.showStatus();
	
		
		


	
		
	
		
		
		
		
	}

}
