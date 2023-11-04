package com.ssafy.ssafit.model.dao;

import java.util.List;

import com.ssafy.ssafit.model.dto.User;

public interface UserDao {
	
	List<User> selectAll();
	
	int insertUser(User user);
	
	User selectOne(String id);

	//아이디 중복확인 위해 파라미터로 들어온 id와 같은 값 있는지 확인
	int selectId(String id);
	
}
