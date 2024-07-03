package org.kh.library.model.dao;

import java.sql.Connection;
import java.util.ArrayList;

import org.kh.library.model.vo.Book;

public interface BookStore {

	public ArrayList<Book> selectAllBook(Connection conn);
	public Book selectBookOne(int bookNo, Connection conn);
	public int insertBook(Book book, Connection conn);
	public int deleteBook(int bookNo, Connection conn);
	
}
