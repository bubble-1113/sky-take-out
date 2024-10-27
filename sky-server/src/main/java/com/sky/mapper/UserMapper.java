package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    /**
     * 根据openid查询用户
     * @param openid
     * @return
     */
    @Select("select * from user where openid = #{openid}")
    User getByOpenid(String openid);

    /**
     * 插入数据
     * @param user
     */
    void insert(User user);

    @Select("select * from user where id = #{id}")
    User getById(Long id);
}


//
//import org.apache.ibatis.annotations.*;
//
//@Mapper
//public interface UserMapper{
//
//    @Insert("insert into user(name,age) values (#{name},#{age})")
//    @Options(useGeneratedKeys = true,keyProperty = "id")
//    void insert(User user);
//
//    @Delete("delete from user where id = #{id}")
//    void deleteById(Long id);
//
//    @Delete("delete from user")
//    void deleteAll();
//
//    @Select("select * from user where id = #{id}")
//    User getById(Long id);
//}
