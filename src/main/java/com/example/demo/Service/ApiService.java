package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Book;
import com.example.demo.Repositories.BookRepo;
@Service
public class ApiService {
	@Autowired 
    BookRepo stRepo;
	
	public Book saveDetails(Book e) {
		return stRepo.save(e);
	}
	public List <Book>getDetails()

{
		return stRepo.findAll();
		
}
	public Book UpdateDetails(Book e1)
	{
		return stRepo.saveAndFlush(e1);
	}
	
	public void deleteDetails (int id)
	{		
	
	    stRepo.deleteById(id);	
	
	}
}