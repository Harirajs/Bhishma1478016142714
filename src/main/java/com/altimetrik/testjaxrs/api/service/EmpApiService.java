package com.altimetrik.testjaxrs.api.service;

import com.altimetrik.testjaxrs.model.Emp;
import java.util.List;
import java.util.Set;
import com.altimetrik.testjaxrs.exception.NotFoundException;

public interface EmpApiService {
  
      List<Emp> findAllEmp()
      throws NotFoundException;
  
      Emp updateEmp(Emp emp)
      throws NotFoundException;
  
      Emp addEmp(Emp emp)
      throws NotFoundException;
  
      Emp findByIdEmp(Long id)
      throws NotFoundException;
  
      void deleteEmp(Long id)
      throws NotFoundException;
  
}
