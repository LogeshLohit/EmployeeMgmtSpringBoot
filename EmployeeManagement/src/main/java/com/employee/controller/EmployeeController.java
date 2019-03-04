package com.employee.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employee.beans.EmployeePersonalInfo;
import com.employee.repository.EmployeePersonalInfoRepository;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeePersonalInfoRepository repository;

	@GetMapping("/findAll")
	public List<EmployeePersonalInfo> findAll() {
		List<EmployeePersonalInfo> employees = new ArrayList<EmployeePersonalInfo>();
		repository.findAll().forEach(employees::add);
		return employees;
	}

	@GetMapping("/findById/{empNo}")
	public EmployeePersonalInfo findById(@PathVariable("empNo") int employeeNo) {
		Optional<EmployeePersonalInfo> employee = repository.findById(employeeNo);
		EmployeePersonalInfo emp = employee.orElse(null);
		if (emp == null)
			System.out.println("Employee Not found!");
		return emp;
	}

	@GetMapping("/findAllByName/{empName}")
	public List<EmployeePersonalInfo> findAllByName(@PathVariable("empName") String employeeName) {
		List<EmployeePersonalInfo> employees = new ArrayList<EmployeePersonalInfo>();
		repository.findAllByEmployeeNameContaining(employeeName).forEach(employees::add);
		return employees;
	}

}
