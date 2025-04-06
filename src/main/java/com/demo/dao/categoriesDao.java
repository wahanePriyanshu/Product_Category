package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.Categories;


@Repository
public interface categoriesDao extends JpaRepository<Categories, Integer>{

	List<Categories>findAll();
	
	Categories save(Categories c);
	
	
	@Query(value = "delete from Categories where id=?",nativeQuery = true)
	@Modifying
	int deleteById (int id);
	
	
	Categories findById(int id);
}
