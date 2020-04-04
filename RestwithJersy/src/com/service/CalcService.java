package com.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class CalcService {
	
	@GET
	@Path("/{param1}/{param2}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response add(@PathParam("param1") int i,@PathParam("param2") int j) {
 		int output = (i+j);
 		String output1 = String.valueOf(output);
 		return Response.status(200).entity(output1).build();
 	}

}
