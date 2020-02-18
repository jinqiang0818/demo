package com.example.demo.dao;


import com.example.demo.bean.PersonInfo;

import java.util.List;

public interface PersonInfoDao {

    Integer addBean(PersonInfo personInfo);

    List<PersonInfo> queryList();
}
