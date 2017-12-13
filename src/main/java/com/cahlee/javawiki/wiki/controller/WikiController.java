package com.cahlee.javawiki.wiki.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WikiController {
	
	private static final Logger logger = LoggerFactory.getLogger(WikiController.class);

	@RequestMapping(value = "/wiki.do", method = RequestMethod.GET)
	public String wiki(Locale locale, Model model) {
		logger.info("wiki page");
		
		return "wiki";
	}
}
