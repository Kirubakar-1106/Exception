package com.example.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;
@RequestMapping(value="/admin")
@RestController
public class DemoController {
	@GetMapping(value = "/Hi")
	public String display() {
		return "hello world";
	}

	@GetMapping(value = "/myname")
	public String myname() {
		return "Hello Kirubakar";
	}

	@GetMapping(value = "/add/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}
    @GetMapping(value = "/eligible/{a}")
	public String voterEligibilty(@PathVariable int a) {
	   if(a>18) {
	   return "Eligible for vote"; 
	   }
	   else {
	   return "Not Eligible for vote";
	   }
   }
    @GetMapping(value = "/findsquarenums/{b}")
    public int findsquarenumbers(@PathVariable int b) {
    	for(int i=0;i<=b;i++) {
    	if(i%2==0) {
        return i;
    	}
    	}
		return b;
    }
    
    @GetMapping(value = "/findfact/{a}")	
    public int findfactorial(@PathVariable int a) {
    	int fact=1;
    	for(int i=1;i>=a;i++) {
    		fact=fact*i;
    	}
    	return fact;
    	}
    
    
   @GetMapping(value = "/findprime/{a}")
    public String findprimeornot(@PathVariable int a) {
		int count=0;
		for (int i=1;i<=a;i++) {
			if (a%i==0) {	
				count=count+1;	
			}
		}
			if (count==2) {	
				//System.out.println("prime");
				return "is prime";
			}
			else {
				//System.out.println("Not prime");
				return "not prime";
			}
		}
   @GetMapping(value = "/fibonacci/{a}")
   public int printfibonacci(int a) {
	   int n1=0, n2=1, n3=0;
	   for(int i=0;i<=a;i++) {
		   n3=n1+n2;
		   n1=n2;
		   n2=n3;
	   return n3;
   }
	   return n3;
   }
   @GetMapping(value = "/check")
   public String checkpermission(@PathParam("username")String username, @PathParam("password")int password) {
    if(username.equals("Kiruba")&&password==1106) {
    	return "accessed";
    }
    else {
    	return "denied";
    }
}
   @GetMapping(value = "/showcar")
   public int getcar(@RequestBody Car c) {
	   if(c.getcolour()=="Black") {
	 //  return c.getprice()+c.getprice()*10/100;
   }
	return c.getprice()+c.getprice()*10/100;
}
   @GetMapping(value = "/listcars")
   public List<Car> listcars(@RequestBody List<Car> d) {
	   return d;
   }

   @GetMapping(value = "/listcars2")
   public List<Car> listcars2( @RequestBody List<Car> e ){
	 List<Car>carsnew=e.stream().filter(x->x.getcolour().equals("Black")).collect(Collectors.toList());
	  return carsnew;
}
   @GetMapping(value = "/listcars3")
   public List<Car> listcars3(@RequestBody List<Car> f){
	   List<Car>carsnew=f.stream().filter(x->x.getprice()>300000).collect(Collectors.toList());
	   return carsnew;
   }
   @GetMapping(value = "/listcars4")
   public Car listcars4(@RequestBody List<Car> g) {
	   Car max=g.stream().max(Comparator.comparingInt(Car::getprice)).get();
	   return max;
   }
   @GetMapping(value = "/listcars5")
   public List<Car> list5(@RequestBody List<Car> q){
	   List<Car>carsnew=q.stream().filter(x->x.getmodel()==2021&&x.getmodel()==2016).collect(Collectors.toList());
	   return carsnew;
   }
   @GetMapping(value = "/listcars6/{model}")
   public List<Car> getbymodel(@RequestBody List<Car> cars,@PathVariable int model){
	   return cars.stream().filter(x->x.getmodel()==model).toList();
   }
}