package com.altimetrik.testjaxrs.api.service.impl;

import com.altimetrik.testjaxrs.api.service.*;
import com.altimetrik.testjaxrs.model.*;
import org.springframework.stereotype.Service;
import com.altimetrik.testjaxrs.model.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import com.altimetrik.testjaxrs.model.Emp;

import java.util.*;
import com.altimetrik.testjaxrs.exception.NotFoundException;

@Service
public class EmpApiServiceImpl implements EmpApiService {
  	  @Autowired
  	  private EmpRepository empRepository ;
  	  
  
  
      @Override
      public List<Emp> findAllEmp()
      throws NotFoundException {
      
        
  		
  		
   		  List<Emp> list = empRepository.findAll();
      	  return list;
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Emp updateEmp(Emp emp)
      throws NotFoundException {
      
         
      	   return empRepository.save(emp);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Emp addEmp(Emp emp)
      throws NotFoundException {
      
         
      	   return empRepository.save(emp);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Emp findByIdEmp(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		 
      	  return empRepository.findOne(id);
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public void deleteEmp(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
  		  empRepository.delete(id);
  		
  		
  		
  }
  
}
