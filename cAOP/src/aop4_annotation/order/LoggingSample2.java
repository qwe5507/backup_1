package aop4_annotation.order;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*
 * AOP 
 * 2. annotation  이용
 */

// @Aspect , @Order(), 각 메소드 별 어노테이션
@Component
@Order(2)
@Aspect
public class LoggingSample2 {
	
	
	@After("execution(public * aop4_annotation.order.*.*date(..))")
	public void after(JoinPoint p){
		System.out.println("테스트용 ****************** ");
	}
	

}
