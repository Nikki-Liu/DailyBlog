package com.dailyblog.mapper;

import com.dailyblog.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("insert into user (name, id, account_id, token, gmt_create, gmt_modified) values (#{name}, #{id}, #{accountId}, #{token}, #{gmtCreate}, #{gmtModified})")
    void insert(User user);
}
