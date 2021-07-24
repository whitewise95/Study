package com.spring.mvc2.data_transfer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc2.data_transfer.dao.MemberDAO;

@Controller
@RequestMapping("cTOv")
public class ControllerToView {

	@Autowired
	private MemberDAO memberDAO;
	
	/*
	 * 
	 *  예시 1) Model
	 *  
	 *  메서드의 파라미터로 Model을 추가하여 addAddtribute() 메서드로 뷰에서 사용할 데이터를 전달 한다.
	 * 
	 * */
	
	@RequestMapping(value = "/list1")
	public String list1(Model model) {
		model.addAttribute("from" , "list1");
		model.addAttribute("memberList" , memberDAO.selectAllMember());
		return "member/memberList";
	}
	
	
	/*
	 * 예시 2) ModelAndView 클래스 이용
	 * 
	 * ModelAndView객체를 생성하여  addObject() 메서드로 뷰에서 사용할 데이터를 전달 한다.
	 * 관용적으로 객체명으로 mv 혹은 mav로 작성한다.
	 * 
	 * */
	
	@RequestMapping(value = "/list2")
	public ModelAndView list2() {	// return 타입은 String이 아닌 ModelAndView 클래스
		
		// ModelAndView mv = new ModelAndView(); 	// ModelAndView 객체 생성
		// mv.setViewName("member/memberList");    // view에 해당하는 jsp파일 지정
		
		// setviewName 메서드 대신 생성자의 인수로 view페이지명을 지정할 수 있다.
		ModelAndView mv = new ModelAndView("member/memberList");
		
		mv.addObject("from" , "list2");   		// addObject 메서드를 이용하여 데이터 전송
		mv.addObject("memberList", memberDAO.selectAllMember());
		
		return mv;								// ModelAndView 객체를 반환
	
	}
	
	
	
	
	// 예시 3) httpServeletRequest 인터페이스 이용
	
	/*
	  
	 	# 예시 4) ResponseEntity 이용 
	 
		 - HTTP에서 Request와 Response 동작시 전송되는 정보는 크게 body(몸체) , headers(헤더), status code(상태 코드)가 있다.
		 - @ResponseBody 에는 없는 헤더와 상태코드가 함께 들어간다.
		
		1. body
		- HTTP의 request 또는 response가 전송하는 데이터(본문)
		
		2. headers
		- HTTP의 request 또는 response에 대한 부가적인 정보
		
		3. status code
		- 클라이언트의 요청이 성공적으로 처리되었는지 상태를 알려주는 것
		- 상태 코드는 필수적으로 리턴해주어야 한다.

	 */
	
	/*
	  
	 	# 예시 5) ResponseBody이용  
	 	
	 	- ResponseBody와 기능이 같으며 헤더와 상태 코드를 제외한 html 본문만 전송한다.
	 	- 한글 데이터가 전송이 되지 않으며 한글 전송시 ResponseEntity의 객체의 
	 	  객체명.add("Content-Type", "text/html; charset=utf-8") 메서드를 이용하여 헤더 정보를 추가하여 사용한다.
 
	 */	
}
