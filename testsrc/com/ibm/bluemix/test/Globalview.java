package com.ibm.bluemix.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ibm.bluemix.BankDao;

public class Globalview {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Globalview() {
		//fail("Not yet implemented");
		BankDao bank=new BankDao();
		bank.chkLogin("demo", "demo");
		System.out.println("Globalview Completed Successfully");
		
	}

}
