package step2_00_loginEx;

import java.util.Date;


//DTO(Date Transfer Object) : 데이터 전송 객체
public class MemberDTO {
	

	private String 	id;
	private String 	password;
	private String 	name;
	private Date 	joindate;
	
	public MemberDTO() {}
	
	public MemberDTO(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}	
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
}


