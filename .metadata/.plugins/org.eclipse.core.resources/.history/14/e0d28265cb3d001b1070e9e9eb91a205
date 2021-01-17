package aop2_xml_order;

import org.aspectj.lang.JoinPoint;

public class LoggingSample {
	public void before(JoinPoint point) throws Throwable{
		String methodName = point.getSignature().getName();
		System.out.println("[************* 사전작업 ] :" + methodName);
		
	}
	
	public void after(JoinPoint point) throws Throwable{
		String methodName = point.getSignature().getName();
		System.out.println("[************* 사후작업 ] :" + methodName);
		
	}
}
