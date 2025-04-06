package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Categories;
import com.demo.service.CategoriesService;

@Controller
public class MyController {

	@Autowired
	private CategoriesService cs;

	@GetMapping(value = { "/" })
	public ModelAndView m1(ModelAndView m) {
		System.out.println("we are in m1 ");
		m.addObject("Categories", cs.findAll());
		m.setViewName("index.jsp");
		return m;
	}

	@PostMapping(value = "/req1")
	public ModelAndView m2(ModelAndView m, Categories c, String b1) {

		if (b1.equalsIgnoreCase("add")) {

			c=cs.save(c);
			if(c!=null) 
				m.addObject("msg","record added successfully");
			else
				m.addObject("msg","record not inserted");
			m1(m);		}
		if (b1.equalsIgnoreCase("delete")) {
			int check= cs.deleteById(c.getId());
			if(check!=0) 
				m.addObject("msg","record deleted sucessfully");
			else
				m.addObject("msg","record not found");
			m1(m);	
		}
		if (b1.equalsIgnoreCase("display")) {

			c=cs.findById(c.getId());
			if(c!=null) 
			{
				m.addObject("Categories",c);
				m.setViewName("first.jsp");
			}
			else
			{
				m.addObject("msg","record not found");	
				m1(m);
			}
		}
		if (b1.equalsIgnoreCase("update")) {
			
			c=cs.save(c);
			m.addObject("msg","record added sucessfully");
			m1(m);		

		}
		return m;
	}

}
