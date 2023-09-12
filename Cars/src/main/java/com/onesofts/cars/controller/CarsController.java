package com.onesofts.cars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onesofts.cars.entity.Cars;
import com.onesofts.cars.services.CarsServices;
import com.onesofts.cars.entity.Cars;

@RestController
@RequestMapping(value = "/cardetails")
public class CarsController {
	@Autowired
	CarsServices carservices;

	@PostMapping(value = "add")
	public String insertcars(@RequestBody Cars a) {
		return carservices.insertcars(a);
	}

	@PostMapping(value = "/addcars")
	public String insertcars2(@RequestBody List<Cars> v) {
		return carservices.insertcars2(v);
	}

	@GetMapping(value = "/getcarbyId/{id}")
	public Cars getcarbyid(@PathVariable int id) {
		return carservices.getcarbyId(id);
	}

	@DeleteMapping(value = "/deletebyid/{id}")
	public String deletebyid(@PathVariable int id) {
		return carservices.deletebyid(id);
	}

	@PutMapping(value = "/update")
	public String updatebyid(@RequestBody Cars a) {
		return carservices.updatebyid(a);
	}

	@GetMapping(value = "/getall")
	public List<Cars> getallcar() {
		return carservices.getallcar();
	}

	@GetMapping(value = "/getcarbyprice/{price}")
	public List<Cars> getcarbyprice(@PathVariable int price) {
		return carservices.getcarbyprice(price);
	}

	@GetMapping(value = "/getcarbybrand/{brand}")
	public List<Cars> getcarbybrand(@PathVariable String brand) {
		return carservices.getcarbybrand(brand);
	}

	@GetMapping(value = "/getcarbycolour/{colour}")
	public List<Cars> getcarbycolour(@PathVariable String colour) {
		return carservices.getcarbycolour(colour);
	}

	@GetMapping(value = "/getcarbymodel/{model}")
	public List<Cars> getcarbymodel(@PathVariable String model) {
		return carservices.getcarbymodel(model);
	}

	@GetMapping(value = "/getmaxbyprice")
	public Cars getmaxbyprice() {
		return carservices.getmaxbyprice();
	}

	@GetMapping(value = "/getminbyprice") 
	public Cars getminbyprice() {
		return carservices.getminbyprice();
	}
}
