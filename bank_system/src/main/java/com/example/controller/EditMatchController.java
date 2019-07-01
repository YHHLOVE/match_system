package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Match;
import com.example.service.EditMatchInfoService;

@Controller
public class EditMatchController {

	@Autowired
	public EditMatchInfoService editMatchInfoService;
	@GetMapping(value="matchEditInfo")
	public String editMatchInfo(@RequestParam(value="matchId")int matchId,@RequestParam(value="sponsorId")int sponsorId,Model model) {
		System.out.println(matchId+"\t"+sponsorId);
		Match match = editMatchInfoService.editMatchInfo(matchId,sponsorId);
		System.out.println(match);
		model.addAttribute("match", match);
		return "editMatch";
	}
	@PostMapping(value="editMatch")
	public String editMatch(@RequestParam(value="matchId")String matchId,@RequestParam(value="sponsorId")String sponsorId,@RequestParam(value="matchName")String matchName,@RequestParam(value="matchType")String matchType,@RequestParam(value="matchDate")String matchDate,@RequestParam(value="matchAddress")String matchAddress,Model model,HttpServletResponse response) throws IOException {
		System.out.println(matchId);
		System.out.println(sponsorId);
		System.out.println(matchName);
		System.out.println(matchType);
		System.out.println(matchDate);
		System.out.println(matchAddress);
		int result = editMatchInfoService.editMatch(matchId,sponsorId,matchName,matchType,matchDate,matchAddress);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		if (result > 0) {
			
			out.println("<script type='text/javascript'>");
			out.println("window.alert(\"比赛修改成功！\");");
			out.println("window.history.go(-2);");
			out.println("</script>");
		} else {
			out.println("<script type='text/javascript'>");
			out.println("window.alert(\"比赛修改出错！\");");
			out.println("window.history.go(-2);");
			out.println("</script>");
		}
		return null;
	}
}
