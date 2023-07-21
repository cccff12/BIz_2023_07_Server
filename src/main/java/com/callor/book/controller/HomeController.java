package com.callor.book.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.book.model.BookDto;
import com.callor.book.service.BookService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {

	protected final BookService bookService;

	public HomeController(BookService bookService) {
		super();
		this.bookService = bookService;
	}


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(@ModelAttribute("books") BookDto booksDto, Model model) {
		return "book/home";
	}
	
//	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(@ModelAttribute("books") BookDto booksDto, Model model) {
//		
//		List<BookDto> booklist = bookService.selectAll();
//		model.addAttribute("BOOK_LIST", booklist);
//		return "book/input";
//	}


	
	
	
	
	
//	입력창은 이미 home에서 보여주고 있으니 get을 안만들고 바로 post생성
	@RequestMapping(value = "/input", method = RequestMethod.POST)
	public String input(@ModelAttribute("BOOK") BookDto bookDto) {
		int result = bookService.insert(bookDto);
		return "redirect:/";
	}

	
	
}
