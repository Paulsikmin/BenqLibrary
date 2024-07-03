package org.kh.library.controller;

import java.util.List;

import org.kh.library.model.service.BookServiceImpl;
import org.kh.library.model.vo.Book;

public class BookController implements BookControllerI{
	
	BookServiceImpl bService;
	
	public BookController() {
		bService = new BookServiceImpl();
	}

	@Override
	public List<Book> selectAllBook() {
		List<Book> bList = bService.selectAllBook();
		return bList;
	}
	
	@Override
	public Book selectBookOne(int bookNo) {
		Book book = bService.selectBookOne(bookNo);
		return book;
	}
	
	@Override
	public int insertBook(Book book) {
		int result = bService.insertBook(book);
		return result;
	}

	@Override
	public int deleteBook(int bookNo) {
		int result = bService.deleteBook(bookNo);
		return result;
	}
}

























