package com.altimetrik.testjaxrs.model.repository;

import com.altimetrik.testjaxrs.model.*;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface DeptRepository extends JpaRepository<Dept, Long>{

}



