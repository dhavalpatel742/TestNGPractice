package com.retryLogic.Test;


import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryLogicTestCases {
	
	
	
	@Test//(retryAnalyzer = com.AnalyzerRetry.RetryAnalyzer.class)
	public void Test1() {
		Assert.assertEquals(false, true);
	}
	
	@Test//(retryAnalyzer = com.AnalyzerRetry.RetryAnalyzer.class)
	public void Test2() {
		Assert.assertEquals(true, true);
	}
	
	@Test//(retryAnalyzer = com.AnalyzerRetry.RetryAnalyzer.class)
	public void Test3() {
		Assert.assertEquals(false, true);
	}

}
