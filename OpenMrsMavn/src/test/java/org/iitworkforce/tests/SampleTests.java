package org.iitworkforce.tests;

import org.testng.annotations.Test;

import package1.BaseClass;

 
public class SampleTests extends BaseClass {
	
 

	@Test(groups={"regression,sanity"})
	public void m1()
	{
		 
		System.out.println("in TEst");
	}

	@Test(groups={"regression"})
	public void m2()
	{
		 
		System.out.println("in TEst");
	}
}
