package com.bms.member.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bms.member.dao.MemberDAO;
import com.bms.member.dto.MemberDTO;

@Service("memberService")
@Transactional(propagation=Propagation.REQUIRED)
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO memberDAO;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	@Override
	public MemberDTO login(Map<String,String> loginMap) throws Exception{
		
		MemberDTO mdto = memberDAO.login(loginMap);

		if (mdto != null) {
			String rawPassword = loginMap.get("memberPw");
			String encodedPassword = mdto.getMemberPw();
			
			if (passwordEncoder.matches(rawPassword, encodedPassword)) {
				return mdto;
			}
		}
		
		return null;
		
	}
	
	
	@Override
	public void addMember(MemberDTO memberDTO) throws Exception{
		memberDAO.insertNewMember(memberDTO);
	}
	
	
	@Override
	public String overlapped(String id) throws Exception{
		return memberDAO.selectOverlappedID(id);
	}


	@Override
	public List<MemberDTO> FindId(MemberDTO memberDTO) throws Exception {
		
		return memberDAO.selectId(memberDTO);
	}


	@Override
	public boolean FindPw(MemberDTO memberDTO) throws Exception {
		boolean isPw = false;
		String memberId= memberDAO.selectPw(memberDTO);
		if(memberId != null) {
			isPw = true;
		}
		
		return isPw;
	}


	@Override
	public void passwordChage(Map<Object, Object> ListInfo) throws Exception {
		
		memberDAO.updatePassword(ListInfo);
	}


	@Override
	public void cacaoJoin(MemberDTO memberDTO) throws Exception {
		memberDAO.insertCacaoId(memberDTO);
		
	}


	@Override
	public MemberDTO cacaoIdCheck(String memberId) throws Exception {
		
		MemberDTO memberDTO =memberDAO.selectCacaoId(memberId);
			
		return memberDTO;
	}


	@Override
	public boolean naverIdCheck(MemberDTO memberDTO) throws Exception {
		boolean isCheck = false;
		String memberId = memberDTO.getMemberId();
		memberId = memberDAO.selectNaverId(memberId);
		if(memberId != null) {
			isCheck = true;
		}
		
		return isCheck;
	}


	
}
