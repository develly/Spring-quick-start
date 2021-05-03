package com.springbook.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDAO;

// annotation으로 인해 필요없어짐 
//	/**
//	 * @param userDAO the userDAO to set
//	 */
//	public void setUserDAO(UserDAO userDAO) {
//		this.userDAO = userDAO;
//	}

	public UserVO getUser(UserVO vo) {
		// TODO Auto-generated method stub
		return userDAO.getUser(vo);
	}

}
