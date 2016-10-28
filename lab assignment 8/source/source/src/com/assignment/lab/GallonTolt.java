package com.assignment.lab;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
@Path("/GallonTolt")
public class GallonTolt {
	@GET
	@Produces("application/xml")
	public String GTolt(){
		 
		Double Gallon = 0.0;
		Double lt;
		
		lt = Gallon*3.785;
		
		String result="Output: Gallon to liter \n\n" + lt;
		return "<Gallonoutput>" + "<Gallon>" + Gallon + "</Gallon>" + "<output>" + result + "</output>" + "</Gallonoutput>";
		
	}
		@Path("{g}")
		@GET
		@Produces("application/xml")
		
		public String HeightConvert(@PathParam("g") Double Gallon) {
			Double lt;
			
			lt = Gallon*3.785;
			
			String result="Output: Gallon to liter \n\n" + lt;
			return "<Gallonoutput>" + "<Gallon>" + Gallon + "</Gallon>" + "<output>" + result + "</output>" + "</Gallonoutput>";
				
		}

}

