package com.o2o_school.web.user;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.o2o_school.pojo.user.User;
import com.o2o_school.service.user.IUserService;
import com.o2o_school.vo.LoginParameters;

@Controller
@RequestMapping("/user")
public class LoginController {
	  @Autowired
	  private IUserService userService;

	  @RequestMapping(value = "/login")
	  public String loginPage() {
	    return "login";
	  }

	  @RequestMapping(value = "/loginCheck")
	  public ModelAndView loginCheck(HttpServletRequest request, LoginParameters loginParameters) {
	    boolean isValidUser = userService.hasMatchUser(loginParameters
	        .getUser().getUserName(), loginParameters.getUser()
	        .getPassword());
	    if (!isValidUser) {
	      return new ModelAndView("login", "error", "用户名或密码错误!");
	      // request.setAttribute("error", "用户名或密码错误!");
	      // return "login";
	    } else {
	      User user = userService.findUserByUserName(loginParameters
	          .getUser().getUserName());
	      user.setLastIp(request.getLocalAddr());
	      user.setLastVisit(new Date());
	      request.getSession().setAttribute("user", user);
	      return new ModelAndView("main");
	      // return "main";
	    }
	  }
}
