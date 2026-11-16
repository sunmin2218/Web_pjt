package com.office.ex.member;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	Map<String, MemberDto> memDB = new HashMap<String, MemberDto>();
	
	public int insertNewMember(MemberDto memberDto) {
		
		memDB.put(memberDto.getMemId(), memberDto);
		
		return memDB.get(memberDto.getMemId()) != null 
				? 
				MemberService.SIGN_UP_OK 
				: 
				MemberService.SIGN_UP_NG;
		
	}

	public MemberDto selectMemberByMemIdAndMemPw(String memId) {
		
//		if(memberDto != null && memberDto.getMemPw().equals(memPw)) {
//			return memberDto;
//		} else {
//			return null;
//		} 다오는 다오에 관련된 로직만 들어가야 하기 때문에 리턴 멤버디티오 하고 멤버 서비스에서 비밀번호 확인까지 해준다
		// 파라미터도 멤버 페스워드 줄필요 없으니 지워준다
		
	return memDB.get(memId);
	
	}
	
	
	
	
	
	
	

}

