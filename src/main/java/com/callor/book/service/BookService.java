package com.callor.book.service;

import java.util.List;

import com.callor.book.model.BookDto;

public interface BookService {
	public BookDto findNum(String booknum);

	public int insert(BookDto booksDto);

	public List<BookDto> selectAll();
}
