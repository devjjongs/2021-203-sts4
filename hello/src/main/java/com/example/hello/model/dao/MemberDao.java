package com.example.hello.model.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.hello.model.vo.Member;

@Mapper
public interface MemberDao {
	
	Member getMember(@Param("userId") String userId, @Param("userPw") String userPw);
}
