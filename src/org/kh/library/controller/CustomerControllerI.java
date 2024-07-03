package org.kh.library.controller;

import org.kh.library.model.vo.Customer;

public interface CustomerControllerI {
	public void selectAllCustomer();
	public void selectNameSearch(String CName);
	public void selectIdSearch(String CId);
	public void insertCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(String CId);
}
