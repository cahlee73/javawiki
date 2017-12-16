package com.cahlee.javawiki.wiki.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WikiController {
	
	private static final Logger logger = LoggerFactory.getLogger(WikiController.class);

	@RequestMapping(value = "/wiki.do", method = RequestMethod.GET)
	public String wiki(Locale locale, Model model, @RequestParam("wiki") int wiki) {
		logger.info("wiki page");
		
		/* 테스트 용 코드 -> 삭제 예정 */
		HashMap<String, HashMap<String, String>> code = new HashMap<String, HashMap<String, String>>();
		
		HashMap<String, String> temp = new HashMap<String, String>();
		temp.put("0001", "AMOREPACIFIC AMS POS Docs");
		temp.put("0002", "AMOREPACIFIC AMS POS Docs");
		temp.put("0003", "Copyright © IBM GBS Korea 2017");
		temp.put("0004", "resources/img/ibmpos_blue.png");
		code.put("M001", temp);
		
		model.addAttribute("code", code);
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		
		HashMap<String, Object> temp2 = new HashMap<String, Object>();
		temp2.put("name", "메뉴1");
		temp2.put("icon", "fa-table");
		temp2.put("existSubmenu", false);
		temp2.put("wiki", 1);
		list.add(temp2);

		HashMap<String, Object> temp3 = new HashMap<String, Object>();
		temp3.put("name", "메뉴2");
		temp3.put("icon", "fa-wrench");
		temp3.put("existSubmenu", false);
		temp3.put("wiki", 2);
		list.add(temp3);

		HashMap<String, Object> temp4 = new HashMap<String, Object>();
		temp4.put("name", "메뉴3");
		temp4.put("icon", "fa-file");
		temp4.put("existSubmenu", true);
		
		ArrayList<HashMap<String, Object>> list2 = new ArrayList<HashMap<String, Object>>();
		HashMap<String, Object> temp4_1 = new HashMap<String, Object>();
		temp4_1.put("name", "서브메뉴1");
		temp4_1.put("icon", "fa-table");
		temp4_1.put("existSubmenu", false);
		temp4_1.put("wiki", 3);
		list2.add(temp4_1);
		HashMap<String, Object> temp4_2 = new HashMap<String, Object>();
		temp4_2.put("name", "서브메뉴2");
		temp4_2.put("icon", "fa-table");
		temp4_2.put("existSubmenu", false);
		temp4_2.put("wiki", 4);
		list2.add(temp4_2);
		temp4.put("subMenus", list2);
		
		list.add(temp4);

		HashMap<String, Object> temp5 = new HashMap<String, Object>();
		temp5.put("name", "메뉴4");
		temp5.put("icon", "fa-sitemap");
		temp5.put("existSubmenu", true);
		
		ArrayList<HashMap<String, Object>> list3 = new ArrayList<HashMap<String, Object>>();
		HashMap<String, Object> temp5_1 = new HashMap<String, Object>();
		temp5_1.put("name", "서브메뉴1");
		temp5_1.put("icon", "fa-table");
		temp5_1.put("existSubmenu", false);
		temp5_1.put("wiki", 5);
		list3.add(temp5_1);
		HashMap<String, Object> temp5_2 = new HashMap<String, Object>();
		temp5_2.put("name", "서브메뉴2");
		temp5_2.put("icon", "fa-table");
		temp5_2.put("existSubmenu", false);
		temp5_2.put("wiki", 6);
		list3.add(temp5_2);
		HashMap<String, Object> temp5_3 = new HashMap<String, Object>();
		temp5_3.put("name", "서브메뉴3");
		temp5_3.put("icon", "fa-table");
		temp5_3.put("existSubmenu", false);
		temp5_3.put("wiki", 7);
		list3.add(temp5_3);
		temp5.put("subMenus", list3);
		
		list.add(temp5);

		HashMap<String, Object> temp6 = new HashMap<String, Object>();
		temp6.put("name", "메뉴5");
		temp6.put("icon", "fa-link");
		temp6.put("existSubmenu", false);
		temp6.put("wiki", 8);
		list.add(temp6);
		
		model.addAttribute("wiki", wiki);
		model.addAttribute("menus", list);
		
		return "wiki";
	}
}
