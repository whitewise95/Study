package com.bms.member.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bms.member.dto.MemberDTO;
import com.bms.member.service.MemberService;

@Controller("memberController")
@RequestMapping(value="/member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private MemberDTO memberDTO;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@RequestMapping(value="/login.do" , method = RequestMethod.POST)
	public ModelAndView login(@RequestParam Map<String, String> loginMap, HttpServletRequest request) throws Exception {
			
		ModelAndView mv = new ModelAndView();
		
		memberDTO = memberService.login(loginMap);		
		
		if (memberDTO != null && memberDTO.getDelYn().equals("N")) { 	// 조회된 결과가 있으면

			HttpSession session = request.getSession();		// 세션 객체 생성
			session.setAttribute("isLogOn", true);			// 로그인 true
			session.setAttribute("memberInfo",memberDTO);	// memberInfo에 로그인한 계정의 정보등록
			String action = (String)session.getAttribute("action");
			
			if (action!=null && action.equals("/order/orderEachGoods.do")){ // 주문상품으로 이동
				mv.setViewName("forward:"+action);
			}
			else {
				mv.setViewName("redirect:/main/main.do");	// 메인으로 이동
			}
		}
		else { // 조회된 결과가 없으면
			mv.addObject("message", "로그인에 실패하였습니다.");
			mv.setViewName("/member/loginForm");
		}
		return mv;
		
	}

	
	
	
	@RequestMapping(value="/logout.do" , method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		
		session.setAttribute("isLogOn", false);
		session.removeAttribute("memberInfo");
		
		mv.setViewName("redirect:/main/main.do");
		
		return mv;
	
	}
	
	
	@RequestMapping(value="/addMember.do" ,method = RequestMethod.POST)
	public ResponseEntity<String> addMember(@ModelAttribute("memberDTO") MemberDTO memberDTO,
			                HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		if (memberDTO.getEmailstsYn() == null)  memberDTO.setEmailstsYn("N");
		if (memberDTO.getSmsstsYn() == null)    memberDTO.setSmsstsYn("N");
		
		memberDTO.setMemberPw(passwordEncoder.encode(memberDTO.getMemberPw()));
		
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		String message = "";
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "text/html; charset=utf-8");
		try {
		    memberService.addMember(memberDTO);
		    message  = "<script>";
		    message +=" alert('회원가입되었습니다.');";
		    message += " location.href='"+request.getContextPath()+"/member/loginForm.do';";
		    message += " </script>";
		    
		} catch(Exception e) {
			message  = "<script>";
		    message +=" alert('회원가입에 실패하였습니다.');";
		    message += " location.href='"+request.getContextPath()+"/member/memberForm.do';";
		    message += " </script>";
			e.printStackTrace();
		}
		
		return new ResponseEntity<String>(message, responseHeaders, HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value="/overlapped.do" ,method = RequestMethod.POST)
	public ResponseEntity<String> overlapped(@RequestParam("id") String id) throws Exception{
		return new ResponseEntity<String>(memberService.overlapped(id), HttpStatus.OK);
	}

	@RequestMapping(value="/loginForm.do" , method = RequestMethod.GET)
	public ModelAndView loginForm() throws Exception {
		return new ModelAndView("/member/loginForm");
	}

	
	@RequestMapping(value="/memberForm.do" , method = RequestMethod.GET)
	public ModelAndView memberForm() throws Exception {
		return new ModelAndView("/member/memberForm");
	}
	
	
	@RequestMapping(value="/findIdAndPw.do", method = RequestMethod.GET)
	public ModelAndView findIdAndPw(@RequestParam("whatFind")String whatFind) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/member/findIdAndPw");
		mv.addObject("whatFind",whatFind);
		
		return mv;
	}
	@RequestMapping(value="/findIdAndPw.do", method = RequestMethod.POST)
	public ModelAndView findIdAndPwPro(@RequestParam("whatFind")String whatFind,
									   @ModelAttribute("memberDTO") MemberDTO memberDTO) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/member/knowIdAndPw");
		List<MemberDTO> memberId;
		String memberId2;
		if(whatFind.equals("id")) {
			 memberId= memberService.FindId(memberDTO);
			 int size = memberId.size();
			 if(size >= 1) {
				 memberId2 = memberId.get(0).getMemberId();
					if(memberId != null) {
						mv.addObject("memberId",memberId );
						whatFind = "knowId";
						mv.addObject("whatFind",whatFind);
					}
			 }
		}
		else if(whatFind.equals("pw")){
			System.out.println(memberDTO.getMemberId());
			if(memberService.FindPw(memberDTO)) {
				memberId2 = memberDTO.getMemberId();
				whatFind = "knowPw";
				mv.addObject("whatFind",whatFind);
				mv.addObject("memberId",memberId2);
		
			}
		}
		else {
			mv.addObject("whatFind",whatFind);
		}
		System.out.println(whatFind);
		
		
		return mv;
	}
	@RequestMapping(value="/passwordChage.do" ,method = RequestMethod.POST)
	public String passWordChage(@RequestParam("memberPw")String memberPw ,
								@RequestParam("memberId")String memberId)throws Exception {
		
		Map<Object, Object> ListInfo = new HashMap<Object, Object>();
		ListInfo.put("memberPw", passwordEncoder.encode(memberPw));
		ListInfo.put("memberId", memberId);
		
		memberService.passwordChage(ListInfo);
		
		return "/member/login";
		
	}
	

}
