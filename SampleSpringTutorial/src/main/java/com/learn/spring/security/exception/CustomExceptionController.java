package com.learn.spring.security.exception;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class CustomExceptionController {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomExceptionController.class);

	@ExceptionHandler(SQLException.class)
	public String handleDBException(HttpServletRequest request, Exception ex)
	{
		return "/error_pages/db_exception";
	}
	
    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(HttpServletRequest request, Exception ex){
    	logger.error("Requested URL="+request.getRequestURL());
        logger.error("Exception Raised="+ex);
         
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception", ex);
        modelAndView.addObject("url", request.getRequestURL());
         
        modelAndView.setViewName("/error_pages/error");
        return modelAndView;
    }
	
	
}
