package com.onesofts.cars;

import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	RestTemplate rest = new RestTemplate();

	@GetMapping(value = "/hello")
	public String getHiviahello() {
		String url = "http://localhost:8080/Hi";

		ResponseEntity<String> response = rest.exchange(url, HttpMethod.GET, null, String.class);
		String value = response.getBody();
		return value;
	}
    @GetMapping(value = "addviahello/{a}/{b}")
	public int addtwonumbers(@PathVariable int a, @PathVariable int b) {
		String url = "http://localhost:8080/add/";

		ResponseEntity<Integer> response = rest.exchange(url+a+"/"+b, HttpMethod.GET, null, Integer.class);
		int value = response.getBody();
		return a + b;
	}
    
    @GetMapping(value = "emplistviahello")
    public List<Object> getlistviahello(){
    	String url = "http://localhost:8080/employeedetails/getall";
    	
    	ResponseEntity<List> response = rest.exchange(url,HttpMethod.GET,null,List.class);
    	List value = response.getBody();
    	return value;
    }
}
