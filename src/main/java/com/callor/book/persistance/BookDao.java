package com.callor.book.persistance;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.callor.book.model.BookDto;

public interface BookDao {
	@Select(" SELECT COUNT(*) FROM TBL_BOOKS ")
	public int bookCount();

	@Select(" SELECT * FROM TBL_BOOKS ORDER BY B_CODE ")
	public List<BookDto> selectAll();
}
