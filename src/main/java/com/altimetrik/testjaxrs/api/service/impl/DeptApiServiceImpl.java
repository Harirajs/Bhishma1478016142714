package com.altimetrik.testjaxrs.api.service.impl;

import com.altimetrik.testjaxrs.api.service.*;
import com.altimetrik.testjaxrs.model.*;
import org.springframework.stereotype.Service;
import com.altimetrik.testjaxrs.model.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import com.altimetrik.testjaxrs.model.Dept;

import java.util.*;
import com.altimetrik.testjaxrs.exception.NotFoundException;

@Service
public class DeptApiServiceImpl implements DeptApiService {
  	  @Autowired
  	  private DeptRepository deptRepository ;
  	  
  
  
      @Override
      public List<Dept> findAllDept()
      throws NotFoundException {
      
        
  		
  		
   		  List<Dept> list = deptRepository.findAll();
      	  return list;
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Dept updateDept(Dept dept)
      throws NotFoundException {
      
         
      	   return deptRepository.save(dept);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Dept addDept(Dept dept)
      throws NotFoundException {
      
         
      	   return deptRepository.save(dept);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Dept findByIdDept(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		 
      	  return deptRepository.findOne(id);
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public void deleteDept(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
  		  deptRepository.delete(id);
  		
  		
  		
  }
  
}
