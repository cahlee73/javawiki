package com.cahlee.javawiki.user.controller;

import java.util.HashMap;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value = "loginPage.do", method = RequestMethod.GET)
	public String loginPage(Locale locale, Model model) {
		logger.info("login page");
		
		return "login";
	}

	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		logger.info("login");
		
		/* 테스트 용 코드 -> 삭제 예정 */
		HashMap<String, HashMap<String, String>> code = new HashMap<String, HashMap<String, String>>();
		
		HashMap<String, String> temp = new HashMap<String, String>();
		temp.put("0001", "AMOREPACIFIC AMS POS Docs");
		temp.put("0002", "AMOREPACIFIC AMS POS Docs");
		temp.put("0003", "Copyright © IBM GBS Korea 2017");
		code.put("M001", temp);
		
		model.addAttribute("code", code);
		
		return "wiki";
	}
}