package com.o2o_school.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.o2o_school.dao.user.IUserDao;
import com.o2o_school.pojo.user.User;
import com.o2o_school.service.user.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserDao userDao;

	/**
	 * 判断是否有匹配的用户
	 * 
	 * @param userName
	 *            用户名
	 * @param password
	 *            密码
	 * @return 返回boolean结果
	 */
	public boolean hasMatchUser(final String userName, final String password) {
		int matchCount = userDao.getMatchCount(userName, password);
		return matchCount > 0;
	}

	/**
	 * 根据用户名查找用户
	 * 
	 * @param userName
	 *            用户名
	 * @return 返回用户对象
	 */
	public User findUserByUserName(final String userName) {
		return userDao.findUserByUserName(userName);
	}

}
