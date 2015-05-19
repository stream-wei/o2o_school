package com.o2o_school.dao.base;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;


public interface BaseDao<T>{
	/**
	 * 根据参数指定值插入数据
	 * @param sql
	 * @param params
	 */
	void insertObj(String sql,Object ... params);
	
	/**
	 * 根据参数指定值插入数据,返回插入数据的主键值
	 * @param sql
	 * @param obj
	 * @return
	 */
	int insertObj(String sql,Object obj);
	
	/**
	 * 删除指定记录
	 * @param sql
	 * @param params
	 */
	void deleteObj(String sql, Object ... params);
	
	/**
	 * 更新指定记录
	 * @param sql
	 * @param params
	 */
	void updateObj(String sql, Object ... params);
	
	/**
	 * 更新指定记录
	 * @param sql
	 * @param obj
	 */
	void updateObj(String sql, Object obj);
	
	/**
	 * 根据指定条件进行查询,将查询结果放进Map中,适合单行记录
	 * @param sql
	 * @param params
	 * @return
	 */
	Map<String,Object> queryForMap(String sql,Object ...params);
	Map<String,Object> queryForMap(String sql,Object obj);
	
	/**
	 * 根据指定条件进行查询
	 * @param sql
	 * @param clazz
	 * @param params
	 * @return
	 */
	List<T> queryForList(String sql,Class<T> clazz,Object ...params);
	List<T> queryForList(String sql,Class<T> clazz,Object obj);
	
	/**
	 * 根据指定条件进行查询
	 * @param sql
	 * @param params
	 * @return
	 */
	List<Map<String,Object>> queryForListMap(String sql,Object ... params);
	List<Map<String,Object>> queryForListMap(String sql,Object obj);
	
	/**
	 * 根据指定条件进行查询
	 * @param sql
	 * @param clazz
	 * @param params
	 * @return
	 */
	T queryForObj(String sql,Class<T> clazz,Object ... params);
	T queryForObj(String sql,Class<T> clazz,Object obj);
	
	/**
	 * 返回JdbcTemplate,使用者可以自己定义使用方法
	 * @return
	 */
	JdbcTemplate getJdbcTemplate();
}