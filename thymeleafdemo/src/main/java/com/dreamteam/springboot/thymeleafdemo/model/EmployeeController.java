package com.dreamteam.springboot.thymeleafdemo.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	// load employee
	private List<Employee> theEmployees;

	@PostConstruct
	private void loadData() {
		// create employee
		Employee emp1 = new Employee(1, "Laslo", "Kovach", "laslo@newlife.com");
		Employee emp2 = new Employee(2, "Pavel", "Bakum", "pavel@newlife.com");
		Employee emp3 = new Employee(3, "Iliya", "Gerasim", "iliya@newlife.com");

		// create the list
		theEmployees = new ArrayList<>();

		// add the list
		theEmployees.add(emp1);
		theEmployees.add(emp2);
		theEmployees.add(emp3);

	}

	// add mapping for "/list"
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		// add to the String Model
		theModel.addAttribute("employees", theEmployees);
		return "list-employees";
	}
}
