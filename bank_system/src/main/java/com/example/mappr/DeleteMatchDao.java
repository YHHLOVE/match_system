package com.example.mappr;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DeleteMatchDao {

	@Delete("delete from matchs where match_id=#{matchId}")
	int deleteMatch(@Param("matchId")int matchId);
}
