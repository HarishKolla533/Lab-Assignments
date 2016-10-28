package com.assignment.lab;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class TestGallon {

	GallonChecker cv = new GallonChecker();
	Double vol = cv.CVol(3.0);
	Double defVol =  3.20;
	DecimalFormat f = new DecimalFormat("##.00");
	String lt = f.format(vol);
	Double ccm = Double.parseDouble(lt);

	
	@Test
	public void testheight() {
		System.out.println("@Test lt(): " + lt + " = " + ccm);
		assertEquals(defVol, ccm);
	}


}
