package io.singh.springjsp;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
		
	/*
	@RequestMapping("home")
	public String home(HttpServletRequest req) {
		HttpSession session = req.getSession();
		String name = req.getParameter("name");
		session.setAttribute("name", name);
		
		
		return "Home";
	}
	
	*/
	
	/*
	@RequestMapping("home")
	public String home(@RequestParam("name") String myName, HttpSession session) {
		session.setAttribute("name", myName);		
		return "Home";
	}
	
	*/
	
	// Now using model and view concept
	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String myName) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName);
		mv.addObject("age", 30);
		mv.setViewName("Home");
		return mv;
	}
	
	@RequestMapping("alien")
	public ModelAndView alien(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		
		mv.setViewName("Alien");  //JSP page
		return mv;
	}
	
	
	
}
