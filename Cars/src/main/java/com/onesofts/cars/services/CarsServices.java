package com.onesofts.cars.services;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesofts.cars.dao.CarsDao;
import com.onesofts.cars.entity.Cars;

@Service
public class CarsServices {
	@Autowired
	CarsDao carsDao;

	public String insertcars(Cars v) {
		return carsDao.insertcars(v);
	}

	public String insertcars2(List<Cars> v) {
		return carsDao.insertcars2(v);
	}

	public Cars getcarbyId(int id) {
		return carsDao.getcarbyId(id);
	}

	public String deletebyid(int id) {
		return carsDao.deletebyid(id);
	}

	public String updatebyid(Cars a) {
		return carsDao.updatebyid(a);
	}

	public List<Cars> getallcar() {
		return carsDao.getallcar();
	}

	public List<Cars> getcarbyprice(int price) {
		List<Cars> carprice = carsDao.getcarbyprice(price);
		return carprice.stream().filter(x -> x.getPrice() >= price).collect(Collectors.toList());
	}

	public List<Cars> getcarbybrand(String brand) {
		List<Cars> carbrand = carsDao.getcarbybrand(brand);
		return carbrand.stream().filter(x -> x.getBrand().equalsIgnoreCase(brand)).collect(Collectors.toList());
	}

	public List<Cars> getcarbycolour(String colour) {
		List<Cars> carcolour = carsDao.getcarbycolour(colour);
		return carcolour.stream().filter(x -> x.getColour().equalsIgnoreCase(colour)).collect(Collectors.toList());
	}

	public List<Cars> getcarbymodel(String model) {
		List<Cars> carmodel = carsDao.getcarbymodel(model);
		return carmodel.stream().filter(x -> x.getModel().equalsIgnoreCase(model)).collect(Collectors.toList());
	}

	public Cars getmaxbyprice() {
		List<Cars> getmax = carsDao.getmaxbyprice();
		return getmax.stream().max(Comparator.comparingInt(Cars::getPrice)).get();
	}

	public Cars getminbyprice() {
		List<Cars> getmin = carsDao.getminbyprice();
		return getmin.stream().min(Comparator.comparingInt(Cars::getPrice)).get();
	}

}
