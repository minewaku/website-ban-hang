package com.minewaku.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.minewaku.dto.BookDTO;
import com.minewaku.entity.BookEntity;
import com.minewaku.repository.CatagoryRepository;

@Component
public class BookConverter {
	
	@Autowired
	private CatagoryRepository catagoryRepository;
	
	public BookEntity toEntity(BookDTO dto) {
		BookEntity entity = new BookEntity();
		entity.setBookId(dto.getBookId());
		entity.setCatagory(catagoryRepository.findOneByCatagoryId(dto.getCatagoryId()));
		entity.setPublisher(dto.getPublisher());
		entity.setTitle(dto.getTitle());
		entity.setAuthor(dto.getAuthor());
		entity.setDescription(dto.getDescription());
		entity.setPrice(dto.getPrice());
		entity.setQuantity(dto.getQuantity());
		entity.setActive(dto.isActive());
		
		return entity;
	}
	
	public BookDTO toDTO(BookEntity entity) {
		BookDTO dto = new BookDTO();
		dto.setBookId(entity.getBookId());
		dto.setCatagoryId(entity.getCatagory().getCatagoryId());
		dto.setPublisher(entity.getPublisher());
		dto.setTitle(entity.getTitle());
		dto.setAuthor(entity.getAuthor());
		dto.setDescription(entity.getDescription());
		dto.setPrice(entity.getPrice());
		dto.setQuantity(entity.getQuantity());
		dto.setActive(entity.isActive());
		return dto;
	}
}
