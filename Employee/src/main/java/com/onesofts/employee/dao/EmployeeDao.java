package com.onesofts.employee.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesofts.employee.entity.Employee;
import com.onesofts.employee.repository.EmployeeRepository;
import com.onesofts.employee.service.EmployeeService;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository emprep;

	public String insertEmployee(Employee e) {
		emprep.save(e);
		return "Succesfully Saved";
	}

	public String insertEmployees(List<Employee> v) {
		emprep.saveAll(v);
		return "Saved Successfully";
	}

	public Employee getempbyid(int id) {
		return emprep.findById(id).get();

	}

	public String deletebyid(int id) {
		emprep.deleteById(id);
		return "Deleted Successfully";
	}

	public String updatebyid(Employee a) {
		emprep.save(a);
		return "Updates Saved Successfully";
	}

	public List<Employee> getallemp() {
		List<Employee> list = emprep.findAll();
		return list;
	}

	public List<Employee> getempbyname() {
		return emprep.findAll();
	}

	public List<Employee> getempbysalary() {
		return emprep.findAll();
	}

	public List<Employee> getempbygender() {
		return emprep.findAll();
	}

	public List<Employee> getempbyage() {
		return emprep.findAll();
	}

	public List<Employee> getmaxbyage() {
		return emprep.findAll();
	}

	public List<Employee> getminbyage() {
		return emprep.findAll();
	}

	public List<Employee> getbysalary(int a, int b) {
		return emprep.getbysalary(a,b);
	}

	public List<Employee> getbyname(String name) {
		return emprep.getbyname(name);
	}

	public List<Employee> getbygender(String gender) {
		return emprep.getbygender(gender);
	}

	public String updateemployeeagebyid(Employee a) {
		emprep.save(a);
		return "Data Updated Succesfully";
	}

	public List<Employee> getbyage(int a) {
		return emprep.getbyage(a);
	}

	public String postifageiselibile(Employee a) {
		emprep.save(a);
		return "Data Saved Succesfully";
	}

}
