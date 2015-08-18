package com.test;

import static org.junit.Assert.*;

import org.junit.After;
//import org.junit.AfterClass;
import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;


//import com.anusha.copy.Ass1;
import com.anusha.copy.Ass3;

public class Ass3Test {
	Ass3 a;
	

	@Before
	public void setUp() throws Exception {
		a=new Ass3();
	}

	@After
	public void tearDown() throws Exception {
		a=null;
	}

	@Test
	public void test() {
		int arr[]= {-3,-2,-1};
		assertEquals(-1,Ass3.findlarge(arr));
	}

}
