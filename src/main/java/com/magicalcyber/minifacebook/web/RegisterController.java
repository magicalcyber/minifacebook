package com.magicalcyber.minifacebook.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@RequestMapping(method = RequestMethod.POST)
	public String register(Model model, RedirectAttributes redirectAttrs) {
		redirectAttrs.addFlashAttribute("message", "Register successfully.");
		return "redirect:/register";
	}
}
