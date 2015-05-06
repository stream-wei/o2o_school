package com.o2o_school.dao.user.impl;

import com.o2o_school.dao.user.IUserDao;
import com.o2o_school.pojo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDao implements IUserDao {

    @Autowired
    // 装配JdbcTemplate，JdbcTemplate在applicationContext.xml中配置了
    private JdbcTemplate jdbcTemplate;

    @Override
    @SuppressWarnings("deprecation")
    public int getMatchCount(String userName, String password) {
        String sqlStr = " SELECT count(*) FROM tb_user "
                + " WHERE user_name =? and password=? ";
        return jdbcTemplate.queryForInt(sqlStr, new Object[]{userName,
                password});
    }

    @Override
    public User findUserByUserName(final String userName) {
        String sql = " SELECT user_id,user_name,credits "
                + " FROM tb_user WHERE user_name =? ";
        final User user = new User();
        jdbcTemplate.query(sql, new Object[]{userName},
                new RowCallbackHandler() {
                    public void processRow(ResultSet rs) throws SQLException {
                        user.setUserId(rs.getInt("user_id"));
                        user.setUserName(userName);
                        user.setCredits(rs.getInt("credits"));
                    }
                });
        return user;
    }

    @Override
    public void updateLoginInfo(User user) {
        String sql = " UPDATE tb_user SET last_visit=?,last_ip=?,credits=? "
                + " WHERE user_id =?";
        jdbcTemplate.update(
                sql,
                new Object[]{user.getLastVisit(), user.getLastIp(),
                        user.getCredits(), user.getUserId()});
    }

}
