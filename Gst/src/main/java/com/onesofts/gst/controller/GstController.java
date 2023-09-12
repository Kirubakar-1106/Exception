package com.onesofts.gst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onesofts.gst.entity.Gst;
import com.onesofts.gst.services.GstServices;

@RestController
@RequestMapping(value = "/gstdetails")
public class GstController {
	@Autowired
	GstServices gstcontroller;
	
	@PostMapping(value = "/addgstlist")
	public String addgstlist(@RequestBody List<Gst> c) {
		return gstcontroller.addgstlist(c);
	}

	@GetMapping(value = "/getpercentageviahsn/{hsn}")
	public Integer getgstlistbyhsn(@PathVariable int hsn){
		return gstcontroller.getgstlistbyhsn(hsn);
	}
}
