package step9_01.OOP_Theory;

/*
 * 
 *  # 상속
 * 
 *  - 클래스간의 부모자식관계를 설정해서 클래스를 광범위하게 사용이 가능하다.
 *  
 *  - 단일 상속만 가능하다. ( 다중상속 불가 )
 *    Ex) Class A extends B,C,D,E  (불가능)
 *
 *  - 모든 클래스는 Object클래스를 상속받은 상태에서 시작한다.
 *    
 *  - [ 호칭 ]  
 *  
 *  	> 부모 , 상위 , 슈퍼 , 기반 클래스  
 *  	> 자식 , 하위 , 서브 , 파생 클래스
 *
 *  - [ 형식 ]
 * 
 *   	class 자식클래스 이름 extends 부모클래스이름 {
 *   
 *   	}
 * 
 * */

class Character{
	
	
	
	
	int leverl = 1; 
	int power = 10;
	int dex = 10;
	int life = 10;
	int mana = 10;
	
	
	void levelUp() {
		
		this.leverl ++;
		this.power +=10;
		this.dex +=10;
		this.life +=10;
		this.mana +=10;
	}

	void showStatus () {
		System.out.println("# leverl : "+this.leverl);
		System.out.println("# power: "+this.power);
		System.out.println("# dex : "+this.dex);
		System.out.println("# life : "+this.life);
		System.out.println("# mana : "+this.mana);
		System.out.println();
	}
	

	
	
}

class warrior extends Character{}
class Wizard extends Character{}
class z1 extends Character{}

public class OOPEx02 {

	public static void main(String[] args) {
		
		 warrior  war1 = new  warrior ();
		 war1.showStatus();
		 war1.levelUp();
		 war1.showStatus();
		 
		 System.out.println();
		 
		 Wizard wiz1 = new Wizard();
		 wiz1.showStatus();
		 wiz1.levelUp();
		 wiz1.levelUp();
		 wiz1.levelUp();
		 wiz1.showStatus();
		 
	
	}

}
