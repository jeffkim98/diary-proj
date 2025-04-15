package com.legacydiary.service.member;

import org.springframework.stereotype.Service;

import com.legacydiary.domain.LoginDTO;
import com.legacydiary.domain.MemberDTO;
import com.legacydiary.persistence.MemberDAO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // 생성자 주입 방식
public class MemberServiceImpl implements MemberService {

	private final MemberDAO dao; // 생성자 주입 방식
	
	@Override
	public boolean idIsDuplicate(String tmpMemberId) {
		// 중복 이면(한명 이상 있으면) true , 중복이 아니면(0명이면) false
		
		boolean result = false; 
		
		if (dao.selectDuplicateId(tmpMemberId) == 1) { // 중복!!
			result = true;
		}
		return result;
	}

	@Override
	public boolean saveMember(MemberDTO registerMember) {
		
		boolean result = false;
		
		if (dao.insertMember(registerMember) == 1) {
			// 가입성공
			result = true;
		}
		
		return result;
	}

	@Override
	public MemberDTO login(LoginDTO loginDTO) {
		
		return dao.Login(loginDTO);
	}

}
