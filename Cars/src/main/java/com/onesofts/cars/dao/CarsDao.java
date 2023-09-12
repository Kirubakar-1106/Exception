package com.onesofts.cars.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesofts.cars.entity.Cars;
import com.onesofts.cars.repository.CarsRepository;

@Repository
public class CarsDao {
	@Autowired
	CarsRepository carsRepository;

	public String insertcars(Cars a) {
		carsRepository.save(a);
		return "Cars Saved Succesfully";
	}

	public String insertcars2(List<Cars> v) {
		carsRepository.saveAll(v);
		return "List of Cars Saved Successfully";
	}

	public Cars getcarbyId(int id) {
		return carsRepository.findById(id).get();

	}

	public String deletebyid(int id) {
		carsRepository.deleteById(id);
		return "Deleted SuccesFully";
	}

	public String updatebyid(Cars a) {
		carsRepository.save(a);
		return "Updated Cars Saved Successfully";
	}

	public List<Cars> getallcar() {
		List<Cars> list = carsRepository.findAll();
		return list;
	}

	public List<Cars> getcarbyprice(int price) {
		return carsRepository.findAll();
	}

	public List<Cars> getcarbybrand(String brand) {
		return carsRepository.findAll();
	}

	public List<Cars> getcarbycolour(String colour) {
		return carsRepository.findAll();
	}

	public List<Cars> getcarbymodel(String model) {
		return carsRepository.findAll();
	}

	public List<Cars> getmaxbyprice() {
		return carsRepository.findAll();
	}

	public List<Cars> getminbyprice() {
		return carsRepository.findAll();
	}

}
