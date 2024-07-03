package org.kh.library.view;

import java.util.ArrayList;

import org.kh.library.model.vo.Book;
import org.kh.library.model.vo.Customer;
import org.kh.library.model.vo.Library;

public interface LibraryViewI {
	public int mainMenu();
	public void bookMenu();
	public void customerMenu();
	public void libraryMenu();
	
	public void displayLibraryList(ArrayList<Library> list);
	public void displayLibraryList(Library library);
	public void displaySucess(String string);
	
	public String inputUserId();
	public String inputBookName();
	public Library insertLibrary();
	
	public void dispalyBookList(ArrayList<Book> list);
	public void displayMessage(String message);
	public void displayError(String message);
	
	public void dispalyCustomerList(ArrayList<Customer> list);
	public void diplayCutomerOne(Customer customer);
	public void displayBook(Book book);
	
	public String inputCName();
	public String inputCId();
	public Customer inputCustomer();
	public Customer modifyCustomer();
	public int inputBookNo();
	public Book inputBook();
}
