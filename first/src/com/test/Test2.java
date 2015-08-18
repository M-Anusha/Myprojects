package com.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.anusha.copy.Median;

public class Test2 {
	@Test
	public void test() {
		Median m=new Median();
		assertEquals(3,m.median1(new String[]{"4","5","6","0","1","2","3"}));
		assertArrayEquals(new String[]{"3","4","5","6","7","1","2"}, m.rotate(new String[]{"4","5","6","7","1","2","3"}));
	}
}
