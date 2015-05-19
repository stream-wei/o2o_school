package com.o2o_school.dao.base.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.o2o_school.dao.base.BaseDao;

@Repository("baseDao")
public class BaseDaoImpl<T> implements BaseDao<T>{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/*public BaseDaoImpl(){
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
	}*/

	@Override
	public void insertObj(String sql, Object ... params) {
		jdbcTemplate.update(sql, params);
	}
	
	@Override
	public int insertObj(String sql,Object obj) {
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(obj);
		KeyHolder generatedKeyHolder = new GeneratedKeyHolder();
		NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
		namedParameterJdbcTemplate.update(sql, paramSource, generatedKeyHolder);
		return generatedKeyHolder.getKey().intValue();
	}

	@Override
	public void deleteObj(String sql, Object ... params) {
		jdbcTemplate.update(sql, params);
	}

	@Override
	public void updateObj(String sql, Object ... params) {
		jdbcTemplate.update(sql, params);
	}

	@Override
	public void updateObj(String sql, Object obj) {
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(obj);
		NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
		namedParameterJdbcTemplate.update(sql, paramSource);
	}

	@Override
	public Map<String,Object> queryForMap(String sql,Object ... params) {
		return jdbcTemplate.queryForMap(sql,params);
	}
	
	@Override
	public Map<String,Object> queryForMap(String sql,Object obj) {
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(obj);
		NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
		return namedParameterJdbcTemplate.queryForMap(sql, paramSource);
	}
	
	@Override
	public List<T> queryForList(String sql,Class<T> clazz ,Object... params) {
		List<T> resultList = jdbcTemplate.query(sql, ParameterizedBeanPropertyRowMapper.newInstance(clazz));
		return resultList;
	}
	
	@Override
	public List<T> queryForList(String sql,Class<T> clazz ,Object obj) {
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(obj);
		NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
		List<T> resultList = namedParameterJdbcTemplate.query(sql, paramSource, ParameterizedBeanPropertyRowMapper.newInstance(clazz));
		return resultList;
	}

	@Override
	public List<Map<String,Object>> queryForListMap(String sql, Object ... params) {
		List<Map<String,Object>> resultList = jdbcTemplate.queryForList(sql, params);
		return resultList;
	}
	
	@Override
	public List<Map<String,Object>> queryForListMap(String sql, Object obj) {
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(obj);
		NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
		List<Map<String,Object>> resultList = namedParameterJdbcTemplate.queryForList(sql, paramSource);
		return resultList;
	}

	@Override
	public T queryForObj(String sql,Class<T> clazz, Object... params) {
		T obj = jdbcTemplate.queryForObject(sql, clazz, params);
		return obj;
	}
	
	@Override
	public T queryForObj(String sql,Class<T> clazz, Object obj) {
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(obj);
		NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
		T t = namedParameterJdbcTemplate.queryForObject(sql, paramSource, clazz);
		return t;
	}

	@Override
	public JdbcTemplate getJdbcTemplate() {
		return this.jdbcTemplate;
	}
	
}
