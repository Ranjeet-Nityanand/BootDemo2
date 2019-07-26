/**
 * 
 */
package com.boot.BootDemo2.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Ranjeet
 *
 */
@Controller
public class TestController {

	Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping(value = "/")
	@ResponseBody
	public String helloMessage() {
		logger.info("info message-------------======-");
		logger.warn("Warning Message================");
		logger.error("Error Message=================");
		return "Hello World";
	}
}
