package com.minewaku.service;

import com.minewaku.dto.BookDTO;

public interface IBookService {
	public BookDTO save(BookDTO model);
	public BookDTO update(BookDTO model);
}
