package com.dao;

import com.model.M_secu_user;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


/**
 * Created by daibo on 2017/8/11. s
 */
@SpringBootApplication
public class D_secu_user {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private Logger log = LoggerFactory.getLogger(D_secu_user.class);


    public List<M_secu_user> getUserInfoById(String id) {
        String sql = "SELECT `user_id`,`user_name`,`pass_word`,`pass_key`,`role_id`  FROM demo.`secu_user`  WHERE `user_id`=?";
//        jdbcTemplate.query(sql, new Object[]{id}, (rs, rowNum) -> new M_secu_user(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5))
//        ).forEach(user -> log.info(user.toString()));
        return jdbcTemplate.query(sql, new Object[]{id}, (rs, rowNum) -> new M_secu_user(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5))
        );

    }
}
