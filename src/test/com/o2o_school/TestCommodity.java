package o2o_school;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.o2o_school.entity.CategoryParent;
import com.o2o_school.service.commodity.ICommodityService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:o2o_school.xml")
public class TestCommodity {
	@Autowired
	private ICommodityService commodityService;
	
	@Test
	public void testCommodity(){
		List<CategoryParent> lists = commodityService.queryCommodityList();
		for(CategoryParent p : lists){
			System.out.println(p.toString());
		}
	}
}
