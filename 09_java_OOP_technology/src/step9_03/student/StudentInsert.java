package step9_03.student;

import java.util.Scanner;

public class StudentInsert {
	
	private StudentDAO studentDAO;
	
	public StudentInsert(StudentDAO stDAO) {
		this.studentDAO = stDAO;
	}	
	
	public void insert(StudentVO studentVO) {
		String id = studentVO.getId();
		if (checkId(id)) {
			studentDAO.insert(studentVO);
		}
		else {
			System.out.println("중복아이디 입니다");
		}
	}
	
	public void change(StudentVO studentVO) {
		studentDAO.change(studentVO );
	}
	public void del_Id(String id) {
		studentDAO.del_Id(id);
	}
	
	
	
	public boolean checkId(String id) {
		StudentVO studentVO = studentDAO.select(id);
		return studentVO == null? true:false;
	}
	
}
