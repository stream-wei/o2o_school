package com.o2o_school.service.commodity;

import java.util.List;

import com.o2o_school.entity.CategoryParent;
import com.o2o_school.entity.Commodity;

public interface ICommodityService {
	
	public Commodity queryCommodity(Commodity commodity);
	public List<CategoryParent> queryCommodityList();
	public List<Commodity> queryCommodityListByPage(Commodity commodity);
}
