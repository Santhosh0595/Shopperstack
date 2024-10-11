package com.shopperstack.generic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;

public class Iretry implements IRetryAnalyzer{
	@Override
	public boolean retry(ITestResult result) {
		int count=0;
		int retry=2;
		while(count<retry) {
			count++;
			return true;
			
		}
		return false;
		
	}

}
