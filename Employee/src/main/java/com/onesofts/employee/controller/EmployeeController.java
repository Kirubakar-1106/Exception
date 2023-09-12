package com.onesofts.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onesofts.employee.entity.Employee;
import com.onesofts.employee.exceptions.AgeException;
import com.onesofts.employee.entity.Employee;
import com.onesofts.employee.entity.Employee;
import com.onesofts.employee.service.EmployeeService;

@RestController
@RequestMapping(value = "/employeedetails")
public class EmployeeController {
	@Autowired
	EmployeeService empservice;

	@PostMapping(value = "/add")
	public String insertEmployee(@RequestBody Employee e) {
		return empservice.insertEmployee(e);
	}

	@PostMapping(value = "/addemployees")
	public String insertEmployees(@RequestBody List<Employee> v) {
		return empservice.insertEmployees(v);
	}

	@GetMapping(value = "/getempbyId/{id}")
	public Employee getempbyid(@PathVariable int id) {
		return empservice.getempbyid(id);
	}

	@DeleteMapping(value = "/deletebyid/{id}")
	public String deletebyid(@PathVariable int id) {
		return empservice.deletebyid(id);
	}

	@PutMapping(value = "/update")
	public String updatebyid(@RequestBody Employee a) {
		return empservice.updatebyid(a);
	}

	@GetMapping(value = "/getall")
	public List<Employee> getallemp() {
		return empservice.getallemp();
	}

	@GetMapping(value = "/getempbyname/{name}")
	public List<Employee> getempbyname(@PathVariable String name) {
		return empservice.getempbyname(name);
	}

	@GetMapping(value = "/getempbysalary/{salary}")
	public List<Employee> getempbysalary(@PathVariable int salary) {
		return empservice.getempbysalary(salary);
	}

	@GetMapping(value = "/getempbygender/{gender}")
	public List<Employee> getempbygender(@RequestParam String gender) {
		return empservice.getempbygender(gender);
	}

	@GetMapping(value = "/getempbyage/{age}")
	public List<Employee> getempbyage(@RequestParam int age) {
		return empservice.getempbyage(age);
	}

	@GetMapping(value = "/getmaxbyage")
	public Employee getmaxbyage() {
		return empservice.getmaxbyage();
	}

	@GetMapping(value = "/getminbyage")
	public Employee getminbyage() {
		return empservice.getminbyage();
	}

	@GetMapping(value = "/getbysal/{a}/{b}")
	public List<Employee> getbysalary(@PathVariable int a, @PathVariable int b) {
		return empservice.getbysalary(a, b);
	}

	@GetMapping(value = "/getbyname/{name}")
	public List<Employee> getbyname(@PathVariable String name) {
		return empservice.getbyname(name);
	}

	@GetMapping(value = "/getbygender/{gender}")
	public List<Employee> getbygender(@PathVariable String gender) {
		return empservice.getbygender(gender);
	}

	@PutMapping(value = "updateempagebyid")
	public String updateemployeeagebyid(@RequestBody Employee a) {
		return empservice.updateemployeeagebyid(a);
	}

	@GetMapping(value = "/getbyage/{a}")
	public List<Employee> getbyage(@PathVariable int a) {
		return empservice.getbyage(a);
	}

	@PostMapping(value = "/postifageiseligible")
	public String postifageiseligible(@RequestBody Employee a) throws AgeException {
		return empservice.postifageiseligible(a);
	}

	
}
