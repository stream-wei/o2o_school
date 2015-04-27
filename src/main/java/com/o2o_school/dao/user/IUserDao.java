package com.o2o_school.dao.user;

import com.o2o_school.pojo.user.User;

public interface IUserDao {
	/**
	   * 根据用户名和密码获取匹配的个数
	   * @param userName 用户名
	   * @param password 密码
	   * @return 返回匹配的个数
	   */
	  public int getMatchCount(final String userName, final String password);

	  /**
	   * 根据用户名查找用户
	   * @param userName 用户名
	   * @return 返回用户对象
	   */
	  public User findUserByUserName(final String userName);

	  /**
	   * 更新登陆信息
	   * @param user 登陆用户
	   */
	  public void updateLoginInfo(User user);
}
