package org.kh.library.model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.kh.library.common.JDBCTemplate;
import org.kh.library.model.dao.BookStoreImpl;
import org.kh.library.model.vo.Book;

public class BookServiceImpl implements BookService{
	
	private BookStoreImpl bStore;
	
	public BookServiceImpl() {
		bStore = new BookStoreImpl();
	}

	@Override
	public List<Book> selectAllBook() {
		Connection conn = null;
		List<Book> bList = null;
		try {
			conn = JDBCTemplate.getConnection();
			bList = bStore.selectAllBook(conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bList;
	}

	@Override
	public Book selectBookOne(int bookNo) {
		Connection conn = null;
		Book book = null;
		
		try {
			conn = JDBCTemplate.getConnection();
			book = bStore.selectBookOne(bookNo, conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return book;
	}

	@Override
	public int insertBook(Book book) {
		Connection conn = null;
		int result = 0;
		try {
			conn = JDBCTemplate.getConnection();
			result = bStore.insertBook(book, conn);
//			if(result > 0) {
//				conn.commit();
//			}else {
//				conn.rollback();
//			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public int deleteBook(int bookNo) {
		Connection conn = null;
		int result = 0;
		try {
			conn = JDBCTemplate.getConnection();
			result = bStore.deleteBook(bookNo, conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}














