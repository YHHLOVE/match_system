package com.example.mappr;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AddMatchDao {

	@Insert("insert into matchs(sponsor_id,match_name,match_type,match_date,match_address) values(#{sponsorId},#{matchName},#{matchType},#{matchDate},#{matchAddress})")
	public int addMatch(@Param("sponsorId")String sponsorId,@Param("matchName")String matchName,@Param("matchType")String matchType,@Param("matchDate")String matchDate,@Param("matchAddress")String matchAddress);
}
