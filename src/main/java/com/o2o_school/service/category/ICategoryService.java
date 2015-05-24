package com.o2o_school.service.category;

import java.util.List;

import com.o2o_school.entity.CategoryParent;


public interface ICategoryService {

	public List<CategoryParent> queryCategoryParent(String sql,Object ... obj);
}
