package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.service.DeleteMatchService;


@Controller
public class DeleteMatchController {

	@Autowired
	public DeleteMatchService deleteMatchService;
	@RequestMapping(value="matchDelete",method = {RequestMethod.GET,RequestMethod.POST})
	public String matchDelete(@RequestParam(value="matchId")int matchId,HttpServletResponse response) throws IOException {
		System.out.println("删除比赛，比赛号："+matchId);
		int result = deleteMatchService.deleteMatch(matchId);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		if (result > 0) {
			
			out.println("<script type='text/javascript'>");
			out.println("window.alert(\"比赛删除成功！\");");
			out.println("window.history.go(-1);");
			//out.println("window.history.back(-1);");
			out.println("window.location.reload(true);");
			out.println("</script>");
			
		} else {
			out.println("<script type='text/javascript'>");
			out.println("window.alert(\"比赛删除出错！\");");
			out.println("</script>");
			return "welcome";
		}
		return null;
	}
}
