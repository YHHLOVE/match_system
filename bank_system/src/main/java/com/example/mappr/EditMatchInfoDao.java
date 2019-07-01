package com.example.mappr;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.entity.Match;

@Mapper
public interface EditMatchInfoDao {

	@Select("select * from matchs where match_id=#{matchId} and sponsor_id=#{sponsorId}")
	@Results({
		@Result(property="matchId" ,column="match_id"),
		@Result(property="matchName",column="match_name"),
		@Result(property="sponsorId",column="sponsor_id"),
		@Result(property="matchType",column="match_type"),
		@Result(property="time",column="match_date"),
		@Result(property="matchAddress",column="match_address")
	})
	public Match editMatchInfo(@Param("matchId")int matchId,@Param("sponsorId")int sponsorId);
	
	@Update("update matchs set match_name=#{matchName},match_type=#{matchType},match_date=#{matchDate},match_address=#{matchAddress} where match_id=#{matchId} and sponsor_id=#{sponsorId}")
	public int editMatch(@Param("matchId")String matchId,@Param("sponsorId")String sponsorId,@Param("matchName")String matchName,@Param("matchType")String matchType,@Param("matchDate")String matchDate,@Param("matchAddress")String matchAddress);
}
