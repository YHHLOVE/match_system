package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Match;
import com.example.entity.Sponsor;
import com.example.entity.User;
import com.example.service.MatchListService;
import com.example.service.SponsorLoginService;
import com.example.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private SponsorLoginService sponsorLoginService;
	@Autowired
	private MatchListService matchListService;
	@RequestMapping(value = "/",method = {RequestMethod.POST,RequestMethod.GET})
	public String login() {
		return "login";
	}
//	@RequestMapping(value = "loginPage",method = {RequestMethod.POST,RequestMethod.GET})
//	public String loginCn(HttpServletRequest request,HttpSession session,Model model) {
//		int id = Integer.parseInt(request.getParameter("id"));
//		String password = request.getParameter("password");
//		String username = userService.login(id, password);
//		System.out.println("username"+username);
//		session.setAttribute("tname", username);
//		if(username==null) {
//			return "redirect:/";
//		}else {
//			System.out.println(""+id);
////			List<Match> list = matchSerice.findSponor_Match();
////			System.out.println("a"+list.size());
////			model.addAttribute("list", list);
//			return "welcome";
//		}
//	}
	@RequestMapping(value = "loginPage",method = {RequestMethod.GET,RequestMethod.POST})
	public String login(@RequestParam(value="id")int id,@RequestParam(value="password")String password,Model model,HttpSession session) {
		
		Sponsor sponsor = sponsorLoginService.login(id,password);
		System.out.println(sponsor);
		if(sponsor==null) {//未找到时user为空
			return "redirect:/";
		}else {
			System.out.println(sponsor.getSponsorId());
			System.out.println(sponsor.getSponsorPassword());
			System.out.println(sponsor.toString());
			List<Match> matchList = matchListService.findMatchList(id); 
			System.out.println(matchList.size());
			model.addAttribute("matchList", matchList);
			session.setAttribute("sponsor", sponsor);
			model.addAttribute("sponsor", sponsor);
			model.addAttribute("message", "success login");
			return "welcome";
		}
	}

}
