package com.learn.spring.security;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learn.spring.dataPreparation.service.DataPreparationServiceInterface;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired(required=true)
	@Qualifier("dataPreparationService")
	private DataPreparationServiceInterface service = null;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = {"/","/welcome**"}, method = RequestMethod.GET)
	public ModelAndView home(
			@RequestParam(value = "logout", required = false) String logout) {
		logger.info("Welcome ! ");
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is welcome page guest!");
		if (logout != null) {
			model.addObject("logoutMsg", "You've been logged out successfully.");
		}
		else {
			
		}
		model.setViewName("welcome");
		return model;
	}
	
	@RequestMapping(value = "/user*", method = RequestMethod.GET)
	public ModelAndView homeUser(Principal user) {
		logger.info("Welcome home! "+user.getName());
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is welcome page "+user.getName()+"!");
		model.setViewName("welcomeUser");
		return model;
	}
	
	@RequestMapping(value = "/admin*", method = RequestMethod.GET)
	public ModelAndView homeAdmin(Principal user) {
		logger.info("Welcome home! "+user.getName());
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is welcome page for Admin "+user.getName()+" !!");
		model.setViewName("welcomeAdmin");
		return model;
	}
	
	@RequestMapping(value = "/oops", method = RequestMethod.GET)
	public ModelAndView accesssDenied(Principal user) {

		ModelAndView model = new ModelAndView();

		if (user != null) {
			model.addObject("msg", "Hi " + user.getName() 
			+ ", you do not have permission to access this page!");
		} else {
			model.addObject("msg", 
			"You do not have permission to access this page!");
		}

		model.setViewName("/error_pages/403");
		return model;

	}
	
	@RequestMapping(value = "/login" , method = RequestMethod.GET)
	public ModelAndView login(
		@RequestParam(value = "error", required = false) String error) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid creadential! Try again.");
		}

		model.setViewName("login");

		return model;

	}
	
}
