package com.o2o_school.service.user;

import com.o2o_school.pojo.user.User;

public interface IUserService {
	 /**
	   * 判断是否有匹配的用户
	   * @param userName 用户名
	   * @param password 密码
	   * @return 返回boolean结果
	   */
	  public boolean hasMatchUser(final String userName, final String password);
	  
	  /**
	   * 根据用户名查找用户
	   * @param userName 用户名
	   * @return 返回用户对象
	   */
	  public User findUserByUserName(final String userName);
	  
}
