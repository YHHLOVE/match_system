package com.example.mappr;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.example.entity.Sponsor;

@Mapper
public interface SponsorLoginDao {

	@Select("select * from sponsor where sponsor_id=#{id} and sponsor_password=#{password}")
	@Results({
		@Result(property="sponsorId" ,column="sponsor_id"),
		@Result(property="sponsorPassword",column="sponsor_password"),
		@Result(property="sponsorName",column="sponsor_name"),
		@Result(property="sponsorAddress",column="sponsor_address"),
		@Result(property="sponsorLinkman",column="sponsor_linkman"),
		@Result(property="sponsorTel",column="sponsor_tel")
	})
	public Sponsor login(@Param("id")int id,@Param("password")String password);
}
