package step9_01.OOP_Theory;
/*
 * 
 *  # 쓰레드(Thread)
 *  
 *  - 운영체제에 의해서 관리되는 하나의 '작업' 혹은 '태스크'를 의미
 *    	Ex) main()함수도 하나의 쓰레드
 *    
 *  - main() 의외의 다른 쓰레드를 만들려면 Thread클래스를 상속받거나 Runnable 인터페이스를 구현한다.
 * 
 * - 자바에서는 다중 상속을 허용하지 않기 때문에, Thread 클래스를 확장하는 클래스는 다른 클래스를 상속받을 수 없다.
 * - Runnable 인터페이스를 구현했을 경우에는 다른 인터페이스를 구현할 수 있으며 다른 클래스도 상속받을 수 있다.
 * 
 * */
// Thread 클래스를 상속받아서 쓰레드 기능을 구현할 수 있다.
class Music extends Thread{
	
	
	boolean isPlayMusic = true;
	//Thread 클래스로부터 제공되는 run() 메서드 이며 동시적으로 실행할 명령어를 기술하면 된다.
	@Override
	public void run() {
		
			while(isPlayMusic) {
			System.out.println("배경 음악이 연주되는 중.....!");
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
			
		}
		
	}
	
}
// Runnable 인터페이스를 구현하여 쓰레드 기능을 구현 할 수 있다.
class Game implements Runnable {

	
	boolean isPlayGame = true;
	
	@Override
	public void run() {
	
		while(isPlayGame) {
			System.out.println("신나게 게임을 하는중....!");
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}






public class OOPEx12 {

	public static void main(String[] args) {
		
		Music music = new Music();
		Game game = new Game();
		// Thread클래스를 상속받을 경우 객체에서 start()메서드를 이용하여 
		// 쓰레드를 시작한다. > 클래스안에 오버라이딩 된 run() 메서드 호출 
		music.start();
		// Runnable Interface를 구현할 경우 Thread객체에서 생성자의 인수로
				// Runnable Interface를 구현한 객체를 주입하여 새로운 객체를 만들고
				// 새로운 객체를 통해 .start()메서드를 이용하여 스레드를 시작한다. > run()메서드 호출
				
		Thread gameRun = new Thread(game);
		gameRun.start();
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("신나게 카톡을 하는 중 ....");
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
			
			if(i==8) {
				System.out.println("앗...엄마다!!!");
				System.out.println("엄마가 오셔서 게임과 음악을 종료합니다.");
				music.isPlayMusic = false;
				game.isPlayGame = false;
				break;
				
			}
		}
	}
}
