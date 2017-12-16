package com.cahlee.javawiki.system.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SystemController {
	
	private static final Logger logger = LoggerFactory.getLogger(SystemController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		logger.info("root page");
		
		return "login";
	}

	@RequestMapping(value = "/admin.do", method = RequestMethod.GET)
	public String admin(Locale locale, Model model) {
		logger.info("admin page");
		
		return "admin";
	}
}
