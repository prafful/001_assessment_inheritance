package com.assignment.inheritance.test;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

import com.assignment.inheritance.utility.CalculateUtilis;
import com.assignment.inheritance.utility.CalculateUtilsImpl;

public class InheritanceTest {

	static Properties properties = null;

	static {
		try {
			properties = TestUtil.getForProblem1();
		} catch (Exception e) {
			// should never happen
			e.printStackTrace();
			System.out.println("test generating...");
		}

	}

	//SalaryProcessor salaryProcessor = new SalaryProcessorImpl();
	CalculateUtilis calc = new CalculateUtilsImpl();

	@Test
	public void testCircleArea() {
		Double cirArea = calc.getCircleArea();
		Double resCArea = Double.parseDouble((String)properties.get("cirarea"));
		Assert.assertEquals(cirArea, resCArea);

	}

	@Test
	public void testCylinderBaseAreae() {
		Double cbaseArea = calc.getCylinderBaseArea();
		Double resbase = Double.parseDouble((String)properties.get("basearea"));
		Assert.assertEquals(cbaseArea, resbase);
	}

	@Test
	    public void testCylinderVolume(){
	        Double cvol = calc.getCyclinderVolume();
	        Double resVol = Double.parseDouble((String)properties.get("volcyl"));
		    Assert.assertEquals(cvol, resVol);
	    }
	@Test
    public void testCylinderSurfArea(){
        Double csarea = calc.getCylinderSurfaceArea();
        Double resurfarea = Double.parseDouble((String)properties.get("surfarea"));
	    Assert.assertEquals(csarea, resurfarea);
    }
}
