package com.o2o_school.service.category.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.o2o_school.dao.base.BaseDao;
import com.o2o_school.entity.CategoryParent;
import com.o2o_school.service.category.ICategoryService;
@Service("categoryService")
public class CategoryServiceImpl implements ICategoryService{
	
	@Autowired
	private BaseDao<CategoryParent> baseDao;

	@Override
	public List<CategoryParent> queryCategoryParent(String sql, Object... obj) {
		List<CategoryParent> list = baseDao.queryForList(sql, CategoryParent.class, obj);
		return list;
	}
	
}
