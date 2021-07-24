package step3_01.arrayAdvance;
/*
 
 	# 중복 안된 숫자 제거
 	
	int[] test1 = {1,2,3,2,1};		
	int[] test2 = {1,3,4,4,2};
	int[] test3 = {1,1,1,2,1};
	
	// 위 배열에서 중복안된숫자를 제거하시요 
	// 1) {1,2,1,2}
	// 2) {4,4}
	// 3) {1,1,1,1}
	 
 */

public class ArrayEx39_문제 {

	public static void main(String[] args) {
		
		int[] test1  = {1,2,3,2,1};
		int[] test2  = {1,3,4,4,2};
		int[] test3  = {1,1,1,2,1};
		int[] result = new int[5];
		
		for (int i = 0; i < test1.length; i++) {
			int cnt1 = 0;
			int cnt2 = 0;
			int cnt3 = 0;
			for (int j = 0; j < test1.length; j++) {
				if(test1[i] == test1[j]) {
					cnt1++;
				}
				if(test2[i] == test2[j]) {
					cnt2++;
				}
				if(test3[i] == test3[j]) {
					cnt3++;
				}
			}
			if(cnt1==1) {
				test1[i] = 0;
			}
			if(cnt2==1) {
				test2[i] = 0;
			}
			if(cnt3==1) {
				test3[i] = 0;
			}
		}
		for (int i = 0; i < test1.length; i++) {
			if(test1[i]!=0) {
			System.out.print(test1[i]+",");
			}
			
		}
		System.out.println();
		for (int i = 0; i < test2.length; i++) {
			if(test2[i]!=0) {
				System.out.print(test2[i]+",");
			}
			
		}
		System.out.println();
		for (int i = 0; i < test3.length; i++) {
			if(test3[i]!=0) {
				System.out.print(test3[i]+",");
			}
			
		}
		
		System.out.println();
	}

}
