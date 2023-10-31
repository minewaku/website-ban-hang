package com.minewaku.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minewaku.converter.BookConverter;
import com.minewaku.dto.BookDTO;
import com.minewaku.entity.BookEntity;
import com.minewaku.entity.CatagoryEntity;
import com.minewaku.repository.BookRepository;
import com.minewaku.repository.CatagoryRepository;
import com.minewaku.service.IBookService;

@Service
public class BookService implements IBookService {
	
	@Autowired
	private BookConverter bookConverter;

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private CatagoryRepository catagoryRepository;

	@Override
	public BookDTO save(BookDTO model) {
		BookEntity entity = bookConverter.toEntity(model);
		entity = bookRepository.save(entity);
		return bookConverter.toDTO(entity);
	}

	@Override
	public BookDTO update(BookDTO model) {
		// TODO Auto-generated method stub
		return null;
	}

}
