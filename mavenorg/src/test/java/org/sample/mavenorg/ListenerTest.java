package org.sample.mavenorg;

import org.testng.ITestListener;
import org.testng.ITestNGMethod;

import java.util.Set;

import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener,ITestResult{
	@Override		
    public void onFinish(ITestContext arg0) {					
        System.out.println(" Testing is Finished ");			
    
        		
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult arg0) {					
    	System.out.println("*** Test Case Failed ***");			
        		
    }		

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
        System.out.println("*** Test Case Started ***");				
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
        System.out.println("--Test Case is Successfull Passed --");				
        		
    }

	@Override
	public Object getAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAttribute(String name, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<String> getAttributeNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(ITestResult o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getStatus() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setStatus(int status) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ITestNGMethod getMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] getParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setParameters(Object[] parameters) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IClass getTestClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Throwable getThrowable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setThrowable(Throwable throwable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getStartMillis() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getEndMillis() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setEndMillis(long millis) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSuccess() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getHost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] getFactoryParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTestName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getInstanceName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITestContext getTestContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTestName(String name) {
		System.out.println("<<<< Learning Selenium TestNG >>>>");
		
	}

	@Override
	public boolean wasRetried() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setWasRetried(boolean wasRetried) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String id() {
		// TODO Auto-generated method stub
		return null;
	}		

}
