package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.categoriesDao;
import com.demo.model.Categories;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategoriesServiceImpl implements CategoriesService {

	@Autowired
	private categoriesDao cd;

	@Override
	public List<Categories> findAll() {
		
		return cd.findAll();
	}

	@Override
	public Categories save(Categories c) {
		
		return cd.save(c);
	}

	@Override
	public int deleteById(int id) {
		
		return cd.deleteById(id);
	}

	@Override
	public Categories findById(int id) {
		
		return cd.findById(id);
	}
}
