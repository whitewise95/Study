package step1_06.loop;


// # 삼각형 그리기

public class LoopEx22_문제 {
	
	public static void main(String[] args) {
		
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
		for (int i=0; i<9; i++) {
			System.out.print("#");
			if (i%3 == 2) System.out.println();
		}
		
		System.out.println();
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print("#");
				
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
           for(int i = 0; i<3; i++) { 
        	 for(int j=0; j<=i; j++ ) {
        		 System.out.print("#");
        	 }
        	 System.out.println();
           }
           System.out.println();
           
   
		/*
		 * 문제 2)
		 *   #
		 *  ##
		 * ###
		 */
           
           for(int i = 0; i<3; i++) {
        	   for(int j = 0; j<3-(i+1); j++) {
        	   System.out.print(" ");
        	   }
        	   for(int k=0; k<=i; k++) {
        		   System.out.print("#");
        	   }
        	   System.out.println();
           }
           System.out.println();
		
		
		/*
		 * 문제 3)
		 * ###
		 * ##
		 * #
		 */

           for(int i =0; i<3; i++) {
        	   for(int k=1; k<=3-i; k++) {
        		   System.out.print("#");
        	   }
//        	   for(int j =1; j<i; j++ ) {
//        		   System.out.print(" ");
//        	   }
        	   System.out.println();
           }
           System.out.println();
           
           
		
		/*
		 * 문제 4)
		 * ###
		 *  ##
		 *   #
		 */
           for(int i =0; i<3; i++) {
        	   for(int j=1; j<=i; j++) {
        		   System.out.print(" ");
        	   }
        	   for(int k = 0; k<2+(1-i); k++) {
        		   System.out.print("#");
        	   }
        	   System.out.println();
           }
        	System.out.println(); 
        	

		
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */
           
           for(int i=0; i<3; i++) {
        	   for(int j=0; j<i+1; j++) {
        	   System.out.print("@");
        	   
        	   }
        	   for(int k = 0; k<2-i; k++) {
        		   System.out.print("#");
        	   	   }
        	   System.out.println();
           }
           System.out.println();
           
           
           
           
           

		
		/*
		 * 문제 6)
		 *   #
		 *  ###
		 * #####
		 */
           int k = 0;
           
           for(int i =0; i<3; i++) {
        	   for(int j =0; j<2-i; j++) { 
        		   System.out.print(" ");
        	   }
        	   for(int j = 0; j<=k; j++) {
        		   System.out.print("#");
        	   }
        	   
        	   System.out.println();
        	   k+=2;
        	   
           }
           System.out.println();
           
           
           
           
           

		/*
		 * 문제 7)
		 *  #####
		 *   ###
		 *    #
		 */
           
           int m =4;
           
           for(int i=0; i<3; i++) {
        	   for(int j=0; j<i+1; j++) {
        		   System.out.print(" ");
        	   }
        	   for(int j=0; j<=m; j++) {
        		   System.out.print("#");
        	   }
        	   System.out.println();
        	   m-=2;
           }

		
		
	}
}
