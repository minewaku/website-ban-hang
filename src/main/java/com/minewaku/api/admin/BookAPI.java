package com.minewaku.api.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.minewaku.dto.BookDTO;
import com.minewaku.service.IBookService;
import com.minewaku.service.impl.BookService;

@RestController
public class BookAPI {
	
	@Autowired
	IBookService bookService;
	//Thieu get
	@PostMapping(value = "/book")
	public BookDTO add(@RequestBody BookDTO model) {
		return bookService.save(model);
	}
	
	@PutMapping(value = "/book/{id}")
	public BookDTO edit(@RequestBody BookDTO model, @PathVariable("bookId")) {
		return model;
	}
	
	@DeleteMapping(value = "/book")
	public void delete(@RequestBody long[] ids) {

	}
}
