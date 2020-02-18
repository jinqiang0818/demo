package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class MybatisHelloController {

    //springboot 有日志启动器，配置好日志路径即可用，默认是slfj4 + logback
    private static Logger LOG = LoggerFactory.getLogger(MybatisHelloController.class);

    //有JDBC的时候使用，正常的是不用引入JDBC,直接用Druid+mybatis
    @Autowired
    JdbcTemplate jdbcTemplate;

    //这个的sql展示
    @ResponseBody
    @GetMapping("/query")
    public Map<String, Object> queryList(){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from user");
        return list.get(0);
    }

    @Autowired
    UserDao userDao;

    @ResponseBody
    @GetMapping("/select/{id}")
    //@PathVariable 指定某个值，restful风格必须
    public Map<String, Object> queryUserById(@PathVariable("id") int id) {
        LOG.info("begin query id={}",id);
        return userDao.selectUserById(id);
    }

    @ResponseBody
    @GetMapping("/selectUser/{id}")
    //@PathVariable 指定某个值，restful风格必须
    public User queryUserById2User(@PathVariable("id") int id) {
        return userDao.selectUserById2(id);
    }

}
