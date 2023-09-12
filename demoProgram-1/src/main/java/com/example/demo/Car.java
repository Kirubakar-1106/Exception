package com.example.demo;

public class Car {
private String brand;
private int price;
private int model;
private String colour;


public void setbrand(String brand) {
	this.brand=brand;
}
public String getbrand() {
	return brand;
}
public void setprice(int price) {
	this.price=price;
}
public int getprice() {
	return price;
}
public void setmodel(int model) {
	this.model=model;
}
public int getmodel() {
	return model;
}
public void setcolour(String colour) {
	this.colour=colour;
}
public String getcolour() {
	return colour;
}
public String toString() {
	return brand+" "+price+" "+colour;
}
}
