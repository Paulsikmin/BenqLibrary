package org.kh.library.controller;

import java.util.ArrayList;

import org.kh.library.model.vo.Library;

public interface LibraryControllerI {
	public ArrayList<Library> selectAll();
	public void selectOne(String userId);
	public void selectOneByName(String bookName);
	public void insertLibrary(Library library);
}
