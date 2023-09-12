package com.onesofts.cars;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HiController {
@GetMapping(value = "/Hi")
	public String getHi() {
		return "Hi";
	}

@GetMapping(value = "add/{a}/{b}")
public int addtwonumbers(@PathVariable int a,@PathVariable int b) {
	return a+b;
}

}
