package com.onesofts.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.onesofts.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query(value="select * from employee where salary>=? and salary<=?",nativeQuery=true)
	public List<Employee> getbysalary (int sal1, int sal2);
	
	@Query(value="select * from employee where name like ?",nativeQuery=true)
	public List<Employee> getbyname (String name);
	
	@Query(value="select * from employee where gender like ?",nativeQuery=true)
	public List<Employee> getbygender (String gender);
	
	@Query(value="update employee set age=? where id=?",nativeQuery=true)
	public String updateemployeeagebyid (int id);
	
	@Query(value="select e from Employee e where e.age>:a")
	public List<Employee> getbyage(@Param (value = "a")int a);

}
