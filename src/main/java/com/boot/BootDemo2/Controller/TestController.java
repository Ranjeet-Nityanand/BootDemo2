/**
 * 
 */
package com.boot.BootDemo2.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Ranjeet
 *
 */
@Controller
public class TestController {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String helloMessage(ModelMap model) {
		logger.info("info message-------------======");
		logger.warn("Warning Message================");
		// model.put("name", name);
		// logger.error("Error Message==================" + name);
		return "login";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String showMessage(ModelMap model, @RequestParam String name, @RequestParam String password) {
		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}
	
	@RequestMapping(value="/login")
	public ModelAndView helloMessage(@RequestParam String name) {
		ModelAndView view = new ModelAndView();
		view.setViewName("login");
		view.addObject("name", name);
		return view;
	}
	
	}
