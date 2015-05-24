package com.o2o_school.web.index;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.o2o_school.entity.CategoryParent;
import com.o2o_school.service.commodity.ICommodityService;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	@Autowired
	private ICommodityService commodityService;
	
	@RequestMapping("index.do")
	public String index(Model model){
		List<CategoryParent> categoryParents = commodityService.queryCommodityList();
		System.out.println("========================="+categoryParents.get(0).getComoditys().get(0).getImgs().get(0));
		model.addAttribute("categoryParents", categoryParents);
		return "index/index";
	}
	
	@RequestMapping("test.do")
	public String test(){
		return "index/test";
	}
}
