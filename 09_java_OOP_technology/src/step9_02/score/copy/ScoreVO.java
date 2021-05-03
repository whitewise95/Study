package step9_02.score.copy;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

class ScoreVO {
	
	public static int count;	// 객체가 생성될 때 마다 자동으로 1씩 증가시킬 변수
	private int no;				// 번호, 자동증가
	private String name;		// 이름
	private int java;			// java 점수
	private int jsp;			// jsp 점수
	private int spring;			// spring 점수
	private int total;			// 총점
	private double average;		// 평균
	private int rank = 1;		// 석차, 석차를 계산할 기억 장소의 초기치는 무조건 1로 한다.
	
	public ScoreVO(int no, String name, int java, int jsp, int spring, int total, double average, int rank) {
		this.no = no;
		this.name = name;
		this.java = java;
		this.jsp = jsp;
		this.spring = spring;
		this.total = total;
		this.average = average;
		this.rank = rank;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		ScoreVO.count = count;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getJsp() {
		return jsp;
	}

	public void setJsp(int jsp) {
		this.jsp = jsp;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		//return "ScoreVO [no=" + no + ", name=" + name + ", java=" + java + ", jsp=" + jsp + ", spring=" + spring
				//+ ", total=" + total + ", average=" + average + ", rank=" + rank + "]";
		
		return String.format("%d%s%3d%3d%3d%d%6.2f%d", no, name , java , jsp, spring, total, average, rank);
	}
	
	
	
	
}





