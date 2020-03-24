package com.capg.testcases;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
		{RawOrderServiceTest.class,ProductOrderServiceTest.class,RawOrderDetailsTesting.class,
			ProductOrderDetailsTesting.class})
public class TestCases 
{

	public static void main(String[] args)
	{
		Result results=JUnitCore.runClasses(TestCases.class);
		System.out.println("Test Result "+results.wasSuccessful());
		System.out.println("Failure tests count are: "+results.getFailureCount());
		System.out.println(results.getRunCount());
		List<Failure> failure=results.getFailures();
		for(Failure f:failure)
		{
			System.out.println("Therefore we get a failed test case  "+f);
		}
	}
}
