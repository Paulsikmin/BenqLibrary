package org.kh.library.model.dao;

import java.sql.Connection;
import java.util.ArrayList;

import org.kh.library.model.vo.Customer;

public interface CustomerStore {
	public ArrayList<Customer> selectAllCustomer(Connection conn);
	public Customer selectNameSearch(String CName, Connection conn);
	public Customer selectIdSearch(String CId, Connection conn);
	public int insertCustomer(Customer customer, Connection conn);
	public int updateCustomer(Customer customer, Connection conn);
	public int deleteCustomer(String CId, Connection conn);
}
