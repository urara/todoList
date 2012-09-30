package com.example.spring3.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

@Dao(config = AppConfig.class)
public interface TodoDao {
	@Select
	Todo selectById(Integer id);

	@Select
	List<Todo> selectAll();
	
	@Update
	int update(Todo _todo);

	@Insert
	int insert(Todo _todo);

	@Delete
	int delete(Todo _todo);

}