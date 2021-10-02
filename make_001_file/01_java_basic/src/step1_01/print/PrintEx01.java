package step1_01.print; // 1) 패키지선언문은 '항상' 첫줄에 작성한다.


//  package explorer 창이 사라졌을때 window > show biew > package explorer
//  이름 바꾸고 싶은 프로젝트나 클래스에 오른쪽마우스클릭 >  refactor > rename
//  ctrl + m > 창 화면 크게   http://www.eclipsecolorthemes.org/ <<색상
// 2) 주석 ( comment ) : 설명문을 작성하기 위한 방법으로 프로그램의 실행에 영향을 미치지 않는다.

// 2-1) 라인(line) 주석 : 한줄 주석

/*
 * 
 * 2-2) 블록(block) 주석 : 여러줄 주석
 * 
 * 000책임이 000부장의 지시를 받아서
 * ~~~~~코드를 ~~~~게 수정하였음
 * 
 * */

/*
 *  3) 에디터 화면 확대 및 축소 : ctrl + [+] , ctrl + [-]
 *  
 *  
 *  4) 뒤로 되돌리기(redo)  : ctrl + z
 *    앞으로 되돌리기(undo) : ctrl + y
 * 
 * 
 *  5) 저장 : ctrl + s  ,  저장하지 않았을 경우 파일명 왼쪽에 *표시가 나옴.
 *  					  ( 항상 저장하는 습관 권장 )
 *  
 *  
 *  6) 출력문 자동완성
 *  
 *  	6-1) sout + ctrl + space
 *  	6-2) sysout + ctrl + space
 *  
 *  
 *  7) 유용한 단축키 
 *  
 * 		7-1) 복사     : ctrl + alt + 위 or 아래 방향키
 * 		7-2) 이동     : alt        + 위 or 아래 방향키
 * 		7-3) 블록잡기 : shift      + 위 or 아래 방향키
 * 		7-4) 삭제     : ctrl + d
 */

public class PrintEx01 {

	public static void main(String[] args) { // main 메서드의 {} 안에서 코드를 작성한다 .
		
		// tab으로 들여쓰기 이휴 코드를 작성
		System.out.println("=======");  // println : 자동 줄바꿈 기능    컨트롤 + s(저장)
		System.out.println("메뉴 선택");  
		System.out.println("=======");
		System.out.println(); 
		System.out.println("1)로그인(login)");	
		System.out.println("1)로그아웃(logout)");	
		System.out.println("1)종료(exit)");
		
		System.out.println(); // 아무내용이 없으면 줄바꿈 기능만 적용(한줄 띄기)
		System.out.println(); 
		
		System.out.println("출력문 1"); // print : 데이터를 화면에 출력하지만 줄바꿈 기능이 없다.
		System.out.println("출력문 2");
		System.out.println("출력문 3");
		System.out.println();
		System.out.println("--- end ---");
		
		
		
	}

}
