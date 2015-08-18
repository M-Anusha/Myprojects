package com.anusha.copy;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.test.Ass1Test;
public class TestingFinal {
public static void main(String verizon[])
{System.out.println("Checking for Nature of Roots");
Result res=JUnitCore.runClasses(Ass1Test.class);
for(Failure f:res.getFailures())
{
System.out.println(""+f.toString());
}System.out.println(""+res.wasSuccessful());
}
}
