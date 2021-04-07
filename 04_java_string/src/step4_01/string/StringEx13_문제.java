package step4_01.string;

// # 정렬 (사전순으로 정렬해 보시오.)

public class StringEx13_문제 {

	public static void main(String[] args) {
							//5			1		2			4		3
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};

		for (int i = 0; i < names.length; i++) {
			
			String minName = names[i];
			int minIdx = i;

			for (int j = i; j < names.length; j++) {
				if(minName.compareTo(names[j])>0) {  //왜 김유신 과 홍길동을 비교하면 양수
					minName=names[j];
					minIdx=j;
				}
			}
			
			String temp = names[i];
			names[i]=names[minIdx];
			names[minIdx] = temp;
			
			
			
		}
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
		}
		
		
		
		
	}

}
