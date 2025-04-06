package com.demo.service;

import java.util.List;

import com.demo.model.Categories;

public interface CategoriesService {
	List<Categories>findAll();
	Categories save(Categories c);
	int deleteById (int id);
	Categories findById(int id);
}
