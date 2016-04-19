package org.controller;

import java.util.List;

import org.model.Sun;
import org.service.ISun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SunController {

	@Autowired
	ISun iSun;
	
	
	@RequestMapping(value="open")
	public String openUrl (Model model)
	
	{
		Sun sun = new Sun();
		model.addAttribute("sun", sun);
		return "sun";
	}
	
	@RequestMapping(value="save")
	public String saveUrl(@ModelAttribute Sun sun, Model model)
	
	{
		iSun.insertSun(sun);
		model.addAttribute("sun",sun);
		return "sun";
	}
	
	@RequestMapping(value="show")
	public String showSunUrl (Model model)
	{
		System.out.println(22);
		List<Sun> suns = iSun.showSun();
		System.out.println("show");
		model.addAttribute("suns", suns);
		return "sun";
	}
}
