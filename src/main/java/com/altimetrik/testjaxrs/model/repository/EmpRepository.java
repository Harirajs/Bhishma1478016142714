package com.altimetrik.testjaxrs.model.repository;

import com.altimetrik.testjaxrs.model.*;

import com.altimetrik.testjaxrs.model.Dept;
import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface EmpRepository extends JpaRepository<Emp, Long>{

}



