package com.onesofts.gst.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesofts.gst.dao.GstDao;
import com.onesofts.gst.entity.Gst;

@Service
public class GstServices {
	@Autowired
	GstDao gstdao;

	public String addgstlist(List<Gst> c) {
		return gstdao.addgstlist(c);
	}


	public Integer getgstlistbyhsn(int hsn) {
		return gstdao.getgstlistbyhsn(hsn);
	}


}
