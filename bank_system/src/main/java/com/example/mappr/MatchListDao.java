package com.example.mappr;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.example.entity.Match;

@Component
public interface MatchListDao {
	@Select("select * from matchs where sponsor_id=#{id}")
	@Results({
		@Result(property="matchId" ,column="match_id"),
		@Result(property="matchName",column="match_name"),
		@Result(property="sponsorId",column="sponsor_id"),
		@Result(property="matchType",column="match_type"),
		@Result(property="time",column="match_date"),
		@Result(property="matchAddress",column="match_address")
	})
	public List<Match> findMatchList(@Param("id")int id);
}
