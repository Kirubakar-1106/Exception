package com.onesofts.gst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onesofts.gst.entity.Gst;

public interface GstRepository extends JpaRepository<Gst,Integer> {

	@Query(value="select percentage from dev_db.gst where hsn=?",nativeQuery=true)
	public Integer getgstlistbyhsn(int hsn);

}
