package step3_00boardEx;

import java.util.Date;

public class BoardDTO {


	private	int num;
	private	String writer;
	private	String email;
	private	String subject;
	private	String password;
	private	Date regdate;
	private	int readcount;
	private	String content;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getReg_date() {
		return regdate;
	}
	public void setReg_date(Date reg_date) {
		this.regdate = reg_date;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setRead_count(int readcount) {
		this.readcount = readcount;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
