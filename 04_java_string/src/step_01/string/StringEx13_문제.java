package step_01.string;

// # 정렬 (사전순으로 정렬해 보시오.)

public class StringEx13_문제 {

	public static void main(String[] args) {
							//5			1		2			4		3
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
	
		
		for (int i = 0; i < names.length; i++) {
			String newName = names[i];
			int newInt = i;
			for (int j = i; j < names.length; j++) {
				if(newName.compareTo(names[j])>0) {
					newName = names[j];
					newInt = j;
					
				}
			}
			
			String temp = names[i];
			names[i]=names[newInt];
			names[newInt]=temp;
		}
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		
		
		
		
	
	
		
		
	}

}
