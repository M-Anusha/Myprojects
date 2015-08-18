package com.test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.anusha.copy.Ass1;

public class Ass1Test {
Ass1 a;


@Before
public void setUp() throws Exception {
a=new Ass1();
}

@After
public void tearDown() throws Exception {

a=null;
}

@Test

public void sol() {
double k = a.sol();
assertTrue(k<0);
}
}
