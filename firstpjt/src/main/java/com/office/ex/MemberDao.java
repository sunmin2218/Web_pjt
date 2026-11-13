package com.office.ex;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	
	Map<String, MemberDto> memDB = new HashMap<String, MemberDto>();
	
	public int insertNewMemberDao(MemberDto memberDto) {
		
		memDB.put(memberDto.getMemId(), memberDto);
		
		return memDB.get(memberDto.getMemId()) != null ? 1 : 0;
	}

	

}
