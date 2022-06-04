package FactoryImplementation;

import org.testng.annotations.Factory;

public class runner {
	
	@Factory
	public Object[] run()
	{
		Object[] d=new Object[2];
		d[0]=new testclass(1);
		d[1]=new testclass(2);
		return d;
	}

}
