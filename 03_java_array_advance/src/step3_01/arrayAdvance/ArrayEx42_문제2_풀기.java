package step3_01.arrayAdvance;

import java.util.Scanner;

// #오목

public class ArrayEx42_문제2_풀기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

	    int size = 10;
	    int[][] omok= {
	    		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	    		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	    		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	    		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	    		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	    		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	    		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	    		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	    		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	    		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
	    		
	    };
	    
	    int p1x = 0;
	    int p1y = 0;
	    int p2x = 0;
	    int p2y = 0;
	    int turn = 0;
	    int win = 0;
	    while(true) {
		    System.out.println("============오목=============");
		    System.out.println();
		    System.out.print("  ");   //물어보기
		    for (int i = 0; i < size; i++) {
		    	
		    	System.out.print(i+" ");
			}
		    System.out.println();
		    for (int i = 0; i < size; i++) {
		    	System.out.print(i+" ");
		    	for (int j = 0; j < omok.length; j++) {    
	                 System.out.print(omok[i][j]+" ");
				}
				System.out.println();
			}
		    
		    if(win==1) {System.out.println("p1의 승리");
						break;        
			}
			if(win==2) {System.out.println("p2의 승리");
		             	break;
			}
		    if(turn%2==0) {
		    	System.out.println("p1 :x의 값을 입력해주세요");
		    	p1x = scan.nextInt();
		    	System.out.println("p1 : y의 값을 입력해주세요");
		    	p1y = scan.nextInt();
		        if(omok[p1y][p1x]==0) {
		        	omok[p1y][p1x] = 1;         	
		        }
		        else if(omok[p1y][p1x]==1) {
		        	System.out.println("이미 놓아진 자리입니다.");
		        	System.out.println("턴이 넘어갑니다.");
		        }
		    }
		    else if(turn%2!=0) {
		    	System.out.println("p2 : x의 값을 입력해주세요");
		    	p2x =scan.nextInt();
		    	System.out.println("p:2 y의 값을 입력해주세요");
		    	p2y =scan.nextInt();
		    	   if(omok[p2y][p2x]==0) {
			        	omok[p2y][p2x] = 2; 
		    	   }
			        else if(omok[p2y][p2x]==2) {
			        	System.out.println("이미 놓아진 자리입니다.");
			        	System.out.println("턴이 넘어갑니다.");
			        }
		    }
			turn+=1;
	   
	    
	    for (int i = 0; i < size; i++) {
	    	for (int j = 0; j < size-4; j++) {
	    		//가로검사
	    		if(omok[i][j]==1&&omok[i][j+1]==1&&omok[i][j+2]==1&&omok[i][j+3]==1&&omok[i][j+4]==1){win+=1;}
	    		if(omok[i][j]==2&&omok[i][j+1]==2&&omok[i][j+2]==2&&omok[i][j+3]==2&&omok[i][j+4]==2){win+=2;}
	    	}
		}
	    		//세로검사
	    for (int i = 0; i < size-4; i++) {
	    	for (int j = 0; j < size; j++) {
	    		if(omok[i][j]==1&&omok[i+1][j]==1&&omok[i+2][j]==1&&omok[i+3][j]==1&&omok[i+4][j]==1){win+=1;}
	    		if(omok[i][j]==2&&omok[i+1][j]==2&&omok[i+2][j]==2&&omok[i+3][j]==2&&omok[i+4][j]==2){win+=2;}
			}
			
	    }	
	    		//대각선검사
	    for (int i = 0; i <  size-4; i++) {
	    	for (int j = 0; j <  size-4; j++) {
	    		if(omok[i][j]==1&&omok[i+1][j+1]==1&&omok[i+2][j+2]==1&&omok[i+3][j+3]==1&&omok[i+4][j+4]==1){win+=1;}
	    		if(omok[i][j]==2&&omok[i-1][j+1]==2&&omok[i-2][j+2]==2&&omok[i-3][j+3]==2&&omok[i-4][j+4]==2){win+=2;}
			}
			
		}
	    for (int i = 9; i > size - 7; i--) {
			for (int j = 0; j < size - 4; j++) {
				if (omok[i][j] == 1 && omok[i - 1][j + 1] == 1 && omok[i - 2][j + 2] == 1 && omok[i - 3][j + 3] == 1 && omok[i - 4][j + 4] == 1) win = 1;
				if (omok[i][j] == 2 && omok[i - 1][j + 1] == 2 && omok[i - 2][j + 2] == 2 && omok[i - 3][j + 3] == 2 && omok[i - 4][j + 4] == 2) win = 2;
			}
		}
	    		
	    
			
	    
	    
	    
	  
	    }
	    scan.close(); 
	}

}
