package com.example.mappr;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.example.entity.User;

@Mapper
public interface UserDao {
	@Select("select * from user where id=#{id} and password=#{password}")
	@Results({
        @Result(property = "id",  column = "id"),
        @Result(property = "password", column = "password")
    })
	public User login(@Param("id") String id,@Param("password") String password);
}
