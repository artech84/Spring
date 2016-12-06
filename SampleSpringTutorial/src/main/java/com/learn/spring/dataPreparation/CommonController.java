package com.learn.spring.dataPreparation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.learn.spring.dataPreparation.service.DataPreparationServiceInterface;
import com.learn.webservice.arijit.Book;

@Controller
public class CommonController {
	
	@Autowired(required=true)
	@Qualifier("dataPreparationService")
	private DataPreparationServiceInterface service = null;

	
	public ModelAndView getAllBooks(String catagory) {
		
		List<Book> books = new ArrayList<Book>();
		books = service.prepareBooks(catagory);
		return new ModelAndView("welcome", "books", books);
	}
	
}
