package step9_01.OOP_Theory;

//인터페이스 사용 예시 > 상속은 1번, 인터페이스는 복수로 구현이 가능하다. 

class Point {
	
	int x;
	int y;
	void move() {}
	
}

interface Draw {
	
	abstract void draw();
	abstract void erase();
	
}

interface Graphic {
	
	abstract void resize();
	abstract void rotate();
	
}


// 클래스 상속과 인터페이스를 동시에 구현한 예시
class Line extends Point implements Graphic,Draw {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		
	}

	
}



public class OOPEx08 {

	public static void main(String[] args) {
		
			
	}

}
