package o2o_school;


import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.o2o_school.dao.base.BaseDao;
import com.o2o_school.pojo.category.CategoryParent;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:o2o_school.xml")
public class TestDao {
	@Autowired
	private BaseDao<CategoryParent> dao;
	
	@Test
	public void testInsertObj(){
		CategoryParent cParent = new CategoryParent();
		cParent.setName("test");
		cParent.setDescription("testDescription");
		String sql = "insert into category_parent(name,description) values(?,?)";
		dao.insertObj(sql, new Object[]{cParent.getName(),cParent.getDescription()});
	}
	
	@Test
	public void testInsertObjForObj(){
		CategoryParent cParent = new CategoryParent();
		cParent.setName("test");
		cParent.setDescription("testDescription");
		String sql = "insert into category_parent(name,description) values(:name,:description)";
		int i = dao.insertObj(sql, cParent);
		System.out.println(i);
	}
	
	@Test
	public void testDetele(){
		String sql = "delete from category_parent where description = ?";
		dao.deleteObj(sql, new Object[]{"testDescription"});
	}
	
	@Test
	public void testUpdate(){
		CategoryParent cParent = new CategoryParent();
		cParent.setDescription("hello world");
		cParent.setId(10);
		String sql = "update category_parent cp set cp.description = ? where cp.id=?";
		dao.updateObj(sql, new Object[]{cParent.getDescription(),cParent.getId()});
	}
	
	@Test
	public void testUpdateObj(){
		CategoryParent cParent = new CategoryParent();
		cParent.setDescription("hello world!");
		cParent.setId(10);
		String sql = "update category_parent cp set cp.description = :description where cp.id=:id";
		dao.updateObj(sql, cParent);
	}
	
	@Test
	public void testQueryMap(){
		String sql = "select * from category_parent cp where cp.name = ? and cp.description = ?";
		CategoryParent cParent = new CategoryParent();
		cParent.setDescription("testDescription1");
		cParent.setName("test");
		Map<String,Object> map = dao.queryForMap(sql, new Object[]{cParent.getName(),cParent.getDescription()});
		System.out.println(map.get("name"));
	}
	
	@Test
	public void testQueryMapObj(){
		String sql = "select * from category_parent cp where cp.name = :name and cp.description = :description";
		CategoryParent cParent = new CategoryParent();
		cParent.setDescription("testDescription1");
		cParent.setName("test");
		Map<String,Object> map = dao.queryForMap(sql,cParent);
		System.out.println(map.get("name"));
	}
	
	@Test
	public void testQueryForList(){
		String sql = "SELECT * FROM category_parent cp";
		List<CategoryParent> list = dao.queryForList(sql, CategoryParent.class, new Object[]{});
		System.out.println(list.size());
	}
	@Test
	public void testQueryForListObj(){
		String sql = "SELECT cp.description AS description,cp.name AS NAME,cp.id AS id FROM category_parent cp";
		CategoryParent cParent = new CategoryParent();
		List<CategoryParent> list = dao.queryForList(sql, CategoryParent.class, cParent);
		System.out.println(list.size());
	}
}
