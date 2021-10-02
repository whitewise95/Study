package step8_04;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

import javax.management.openmbean.OpenDataException;

class Member {
	
	private int    custno;			// 회원번호
	private String custname;		// 회원성명
	private String phone;			// 회원전화
	private String address;			// 통신사
	private String joindate;		// 가입일자
	private String grade;			// 고객등급
	private String city;			// 거주도시
	
	
	
	public Member() {}
	public Member(int custno, String custname, String phone, String address, String joindate, String grade, String city) {
		this.custno = custno;
		this.custname = custname;
		this.phone = phone;
		this.address = address;
		this.joindate = joindate;
		this.grade = grade;
		this.city = city;
	}
	
	@Override
	public String toString() {
		//return "Member [custno=" + custno + ", custname=" + custname + ", phone=" + phone + ", address=" + address
		//		+ ", joindate=" + joindate + ", grade=" + grade + ", city=" + city + "]";
		return String.format("%d%s",custno,custname);
	}

	public int getCustno() {
		return custno;
	}

	public void setCustno(int custno) {
		this.custno = custno;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
}


class Money {
	
	int custno;			// 회원번호
	int saleno; 		// 판매번호
	int pcost;			// 단가
	int amount;			// 수량
	int price;			// 가격(매출)
	String pcode;		// 상품코드
	String sdate;		// 판매일자
	 
	public Money() {}
	 
	public Money(int custno, int saleno, int pcost, int amount, int price, String pcode, String sdate) {
		this.custno = custno;
		this.saleno = saleno;
		this.pcost = pcost;
		this.amount = amount;
		this.price = price;
		this.pcode = pcode;
		this.sdate = sdate;
	}


	
}

class Last {
	
	int custno;			
	String name;		
	int price;			
	

	 
	public Last() {}



	public Last(int custno, String name, int price) {
		super();
		this.custno = custno;
		this.name = name;
		this.price = price;
	}



	@Override
	public String toString() {
		return custno+"\t"+ name+ "\t" + price ;
	}
	
}

class temp {
	Manager M = new Manager();
	Last[] L = new Last[6];
	void temp() {
		M.init();
		for (int i = 0; i < L.length; i++) {
				L[i] = new Last();
				L[i].custno = M.memberList.get(i).getCustno();
				L[i].name = M.memberList.get(i).getCustname();
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < M.moneyList.size(); j++) {
				if(L[i].custno==M.moneyList.get(j).custno) {
					L[i].price += M.moneyList.get(j).price;
				}
				
			}
		}
	}
	
	
	void temp2() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(L[i].price>L[j].price) {
					if(L[i].price!=0&&L[j].price!=0) {
					Last temp = L[i];
					 L[i]=L[j];
					 L[j] = temp;
					}
					
				}
			}
		}
		
		
	}
	void Print(){
		for (int i = 0; i < 4; i++) {
			System.out.println(L[i]);
			System.out.println("---------------------------");
		}
	}
	
	
}



	
	




class Manager{
	
	ArrayList<Member> memberList = new ArrayList<Member>();
	ArrayList<Money> moneyList = new ArrayList<Money>();
	
	void init() {
		
		memberList.add(new Member(100001, "김행복", "010-1111-2222", "SK", "20151202", "A", "01"));
		memberList.add(new Member(100002, "이축복", "010-1111-3333", "SK", "20151206", "B", "01"));
		memberList.add(new Member(100003, "장믿음", "010-1111-4444", "SK", "20151001", "B", "30"));
		memberList.add(new Member(100004, "최사랑", "010-1111-5555", "SK", "20151113", "A", "30"));
		memberList.add(new Member(100005, "진평화", "010-1111-6666", "SK", "20151225", "B", "60"));
		memberList.add(new Member(100006, "차공단", "010-1111-7777", "SK", "20151211", "C", "60"));
		
		moneyList.add(new Money(100001, 20160001, 500, 5, 2500, "A001", "20160101"));
		moneyList.add(new Money(100001, 20160002, 1000, 4, 4000, "A002", "20160101"));
		moneyList.add(new Money(100001, 20160003, 500, 3, 1500, "A008", "20160101"));
		moneyList.add(new Money(100002, 20160004, 2000, 1, 2000, "A004", "20160102"));
		moneyList.add(new Money(100002, 20160005, 500, 1, 500, "A001", "20160103"));
		moneyList.add(new Money(100003, 20160006, 1500, 2, 3000, "A003", "20160103"));
		moneyList.add(new Money(100004, 20160007, 500, 2, 1000, "A001", "20160104"));
		moneyList.add(new Money(100004, 20160008, 300, 1, 300, "A005", "20160104"));
		moneyList.add(new Money(100004, 20160009, 600, 1, 600, "A006", "20160104"));
		moneyList.add(new Money(100004, 20160010, 3000, 1, 3000, "A007", "20160106"));
		
	}
	
}



public class TestClass {

	public static void main(String[] args) {
		
		temp T = new temp();
		T.temp();
		T.temp2();
		T.Print();
		/*
		   [문제] 아 래와 같이 출력  매출(price) 의 합계 + 내림차순 
		  
			100001	김행복		8000
			--------------------------------
			100004	최사랑		4900
			--------------------------------
			100003	장믿음		3000
			--------------------------------
			100002	이축복		2500
			--------------------------------
		 */


	}

}

