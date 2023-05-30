package com.companyname.springprojectdemo.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GalleryController {
	
	@GetMapping("/gallery")
	public String getGalleryForm(Model model) {
		String[] imgnames = new File("src/main/resources/static/images").list();
		model.addAttribute("Imgnamelist", imgnames);
		return "GalleryForm";
	}
}
