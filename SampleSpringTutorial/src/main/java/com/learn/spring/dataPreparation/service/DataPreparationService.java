package com.learn.spring.dataPreparation.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.learn.webservice.arijit.BookStoreService;
import com.learn.webservice.arijit.BookStoreService_Service;

@Service("dataPreparationService")
public class DataPreparationService implements DataPreparationServiceInterface{

	@Override
	public ArrayList<com.learn.webservice.arijit.Book> prepareBooks(String catagory) {
		
		BookStoreService_Service service = new BookStoreService_Service();
		BookStoreService bookStoreService = service.getBookStoreService();
		
		ArrayList<com.learn.webservice.arijit.Book> books = (ArrayList<com.learn.webservice.arijit.Book>) bookStoreService.showAllBooks(catagory);
		return books;
	}

}
