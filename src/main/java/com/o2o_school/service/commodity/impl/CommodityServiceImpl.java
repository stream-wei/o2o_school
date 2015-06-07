package com.o2o_school.service.commodity.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.o2o_school.dao.base.BaseDao;
import com.o2o_school.entity.Category;
import com.o2o_school.entity.CategoryParent;
import com.o2o_school.entity.Commodity;
import com.o2o_school.service.category.ICategoryService;
import com.o2o_school.service.commodity.ICommodityService;
@Service("commodityService")
public class CommodityServiceImpl implements ICommodityService{

	@Autowired
	private BaseDao baseDao;
	@Autowired
	private ICategoryService categoryService;
	
	private static final String QUERY_COMMODITY_CATEGORY_PARENT_BY_ID = "SELECT c.id,c.name,c.price,c.preferential_price,c.category_parent_id,c.category_id,c.quantity,c.curr_quantity,c.distribution_model,c.delete_flag,c.create_time,c.update_time FROM commodity c WHERE c.category_parent_id=?";
	private static final String QUERY_CATEGORY_PARENT = "SELECT * FROM category_parent cp WHERE cp.id IN(SELECT c.category_parent_id FROM commodity c GROUP BY c.category_parent_id)";
	private static final String QUERY_COMMODITY_IMG = "SELECT ii.location location FROM image_info ii WHERE ii.commodity_id = ?";
	private static final String QUERY_CATEGORY = "SELECT c.id,c.name,c.description,c.parent_id FROM category c WHERE c.parent_id = ?";
	@Override
	public Commodity queryCommodity(Commodity commodity) {
		return null;
	}

	@Override
	public List<CategoryParent> queryCommodityList() {
		List<CategoryParent> categoryParents = categoryService.queryCategoryParent(QUERY_CATEGORY_PARENT, new Object[]{});
		for(CategoryParent categoryParent : categoryParents){
			List<Commodity> commoditys = baseDao.queryForList(QUERY_COMMODITY_CATEGORY_PARENT_BY_ID, Commodity.class, new Object[]{categoryParent.getId()});
			for(Commodity commodity : commoditys){
				List<String> imgs = baseDao.getJdbcTemplate().queryForList(QUERY_COMMODITY_IMG, String.class,new Object[]{commodity.getId()});
				commodity.setImgs(imgs);
			}
			categoryParent.setComoditys(commoditys);
			List<Category> categories = baseDao.queryForList(QUERY_CATEGORY, Category.class, new Object[]{categoryParent.getId()});
			categoryParent.setCategorys(categories);
		}
		return categoryParents;
	}

	@Override
	public List<Commodity> queryCommodityListByPage(Commodity commodity) {
		// TODO Auto-generated method stub
		return null;
	}

}
