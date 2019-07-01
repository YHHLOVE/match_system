package com.example.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.Match;
import com.example.service.MatchListService;

@Controller
public class MatchListController {

	@Autowired
	public MatchListService matchListService;
	@RequestMapping(value="matchList")
	public String listMatch(@Param(value="id")int id,Model model) {
		List<Match> matchList = matchListService.findMatchList(id);
		model.addAttribute("matchList", matchList);
		return "welcome";
	}
}
