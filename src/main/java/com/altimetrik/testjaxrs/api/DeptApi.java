package com.altimetrik.testjaxrs.api;

import com.altimetrik.testjaxrs.api.service.DeptApiService;
import javax.ws.rs.core.GenericEntity;
import java.util.List;

import com.altimetrik.testjaxrs.model.Dept;

import com.altimetrik.testjaxrs.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/dept")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class DeptApi  {

   @Autowired
   private DeptApiService service;

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response findAllDept()
    throws NotFoundException {
    	
    	
  		
  		
  		  GenericEntity<List<Dept>> list = new GenericEntity<List<Dept>>(service.findAllDept()) {};
      	  return Response.ok().entity(list).build();
  		
  		
  		
  		
  		
  		
  		
    
    }
    @PUT
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response updateDept(Dept dept)
    throws NotFoundException {
    	
    	 
      	  return Response.ok().entity(service.updateDept(dept)).build();
  		
  		
  		
  		
  		
  		
  		
  		
  		
    
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response addDept(Dept dept)
    throws NotFoundException {
    	
    	 
      	  return Response.ok().entity(service.addDept(dept)).build();
  		
  		
  		
  		
  		
  		
  		
  		
  		
    
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response findByIdDept( @PathParam("id") Long id)
    throws NotFoundException {
    	
    	
  		
  		
  		
  		 
      	  return Response.ok().entity(service.findByIdDept(id)).build();
  		
  		
  		
  		
  		
    
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response deleteDept( @PathParam("id") Long id)
    throws NotFoundException {
    	
    	
  		
  		
  		
  		
  		
  		 
  		  service.deleteDept(id);
      	  return Response.ok().build();
  		
  		
  		
    
    }
}


