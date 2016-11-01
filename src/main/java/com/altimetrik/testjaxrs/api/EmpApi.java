package com.altimetrik.testjaxrs.api;

import com.altimetrik.testjaxrs.api.service.EmpApiService;
import javax.ws.rs.core.GenericEntity;
import java.util.List;

import com.altimetrik.testjaxrs.model.Emp;

import com.altimetrik.testjaxrs.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/emp")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class EmpApi  {

   @Autowired
   private EmpApiService service;

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response findAllEmp()
    throws NotFoundException {
    	
    	
  		
  		
  		  GenericEntity<List<Emp>> list = new GenericEntity<List<Emp>>(service.findAllEmp()) {};
      	  return Response.ok().entity(list).build();
  		
  		
  		
  		
  		
  		
  		
    
    }
    @PUT
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response updateEmp(Emp emp)
    throws NotFoundException {
    	
    	 
      	  return Response.ok().entity(service.updateEmp(emp)).build();
  		
  		
  		
  		
  		
  		
  		
  		
  		
    
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response addEmp(Emp emp)
    throws NotFoundException {
    	
    	 
      	  return Response.ok().entity(service.addEmp(emp)).build();
  		
  		
  		
  		
  		
  		
  		
  		
  		
    
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response findByIdEmp( @PathParam("id") Long id)
    throws NotFoundException {
    	
    	
  		
  		
  		
  		 
      	  return Response.ok().entity(service.findByIdEmp(id)).build();
  		
  		
  		
  		
  		
    
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response deleteEmp( @PathParam("id") Long id)
    throws NotFoundException {
    	
    	
  		
  		
  		
  		
  		
  		 
  		  service.deleteEmp(id);
      	  return Response.ok().build();
  		
  		
  		
    
    }
}


