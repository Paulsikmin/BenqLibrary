package org.kh.library.controller;

import org.kh.library.model.vo.Book;

public interface BookControllerI {
	public void selectAllBook();
	public void selectBookOne(int bookNo);
	public void insertBook(Book book);
	public void deleteBook(int bookNo);
}
