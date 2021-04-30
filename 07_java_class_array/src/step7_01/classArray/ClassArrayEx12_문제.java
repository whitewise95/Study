package step7_01.classArray;

// 문자열(2단계) [문제]

class Test{

	int num;	  // 인덱스
	int size;	  // 데이터의 개수
	char[] data;  // 데이터의 저장 배열
	
	void print() {
		for(int i=0; i<size; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
	
}

public class ClassArrayEx12_문제 {

	public static void main(String[] args) {
		
	
        // data의 정보를 클래스배열에 저장.
		// 첫번째 /는 인덱스이다.
		// 두번째 /는 데이터의 개수이다.
		// 두번째 / 이후부터 data의 정보이다.
		
		
		String data ="6\n";						// 0Test의 크기
		data += "0/2/a/b\n";					// 1인덱스 / 데이터개수 / 데이터 ~~
		data += "1/3/a/b/c\n";					// 2인덱스 / 데이터개수 / 데이터 ~~
		data += "2/5/a/b/c/d/e\n";				// 3인덱스 / 데이터개수 / 데이터 ~~
		data += "3/4/a/b/c/d\n";				// 4인덱스 / 데이터개수 / 데이터 ~~
		data += "4/3/a/b/c\n";					// 5인덱스 / 데이터개수 / 데이터 ~~
		data += "5/1/a";						// 6인덱스 / 데이터개수 / 데이터 ~~

			
		String temp[] =data.split("\n"); 
		
		for (int i = 1; i < temp.length; i++) {
			int size =Integer.parseInt(temp[0]);
			Test[] t = new Test[size];
			t[i-1] = new Test();
			String temp2[] =temp[i].split("/");
			t[i-1].size = temp2[1];
			t[i-1].num = 
			t[i-1].num = 
		}

	}

}
