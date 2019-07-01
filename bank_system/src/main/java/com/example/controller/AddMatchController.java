package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.service.AddMatchService;

@Controller
public class AddMatchController {

	@Autowired
	public AddMatchService addMatchService;
	@RequestMapping(value="AddMatch")
	public String addMatch() {
		return "addMatch";
	}
	
	@RequestMapping(value = "addMatch",method = {RequestMethod.GET,RequestMethod.POST})
	public String MatchAdd(@RequestParam(value="sponsorId")String sponsorId,@RequestParam(value="matchName")String matchName,@RequestParam(value="matchType")String matchType,@RequestParam(value="matchDate")String matchDate,@RequestParam(value="matchAddress")String matchAddress,Model model,HttpServletResponse response) throws IOException {
		System.out.println(sponsorId);
		System.out.println(matchName);
		System.out.println(matchType);
		System.out.println(matchDate);
		System.out.println(matchAddress);
		int result = addMatchService.addMatch(sponsorId,matchName,matchType,matchDate,matchAddress);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		if (result > 0) {
			
			out.println("<script type='text/javascript'>");
			out.println("window.alert(\"比赛添加成功！\");");
			//out.println("window.history.back(-1);");
			out.println("</script>");
			return "addMatch";
		} else {
			out.println("<script type='text/javascript'>");
			out.println("window.alert(\"比赛添加出错！\");");
			//out.println("window.history.back(-1);");
			out.println("</script>");
			return "addMatch";
		}
	}
}
