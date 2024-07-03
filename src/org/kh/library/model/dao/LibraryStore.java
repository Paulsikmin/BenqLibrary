package org.kh.library.model.dao;

import java.sql.Connection;
import java.util.ArrayList;

import org.kh.library.model.vo.Library;

public interface LibraryStore {
	public ArrayList<Library> selectList(Connection conn);
	public Library selectOne(String userId, Connection conn);
	public Library selectOneByName(String bookName, Connection conn);
	public int insertLibrary(Library library, Connection conn);
}
