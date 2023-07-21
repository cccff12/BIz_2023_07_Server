package com.callor.book.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.book.model.BookDto;
import com.callor.book.service.BookService;

@Service
public class BookServiceImplV1  implements BookService{

	@Override
	public BookDto findNum(String booknum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BookDto booksDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BookDto> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
