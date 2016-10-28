package com.assignment.lab;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/ltToGallon")
public class ltToGallon {
	@GET
	@Produces("application/xml")
	public String lttom(){
		 
		Double lt = 0.0;
		Double g;
		
		g = lt*0.264172;
		
		String result = "Output: liter to Gallon \n\n" + g;
		return "<ltToM>" + "<lt>" + lt + "</lt>" + "<Gallon>" + result + "</Gallon>" + "</ltToG>";
		
	}
		@Path("{lt}")
		@GET
		@Produces("application/xml")
		
		public String WeightConvert(@PathParam("lt") Double lt) {
			Double g;
			g = lt*0.264172;
			
			String result = "Output: liter to Gallon \n\n" + g;
			return "<ltToG>" + "<lt>" + lt + "</lt>" + "<Gallon>" + result + "</Gallon>" + "</ltToG>";
			}
}

