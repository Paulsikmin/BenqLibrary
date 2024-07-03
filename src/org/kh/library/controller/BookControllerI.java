package org.kh.library.controller;

import java.util.List;

import org.kh.library.model.vo.Book;

public interface BookControllerI {
	public List<Book> selectAllBook();
	public Book selectBookOne(int bookNo);
	public int insertBook(Book book);
	public int deleteBook(int bookNo);
}
