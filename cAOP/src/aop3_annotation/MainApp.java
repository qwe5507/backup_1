package aop3_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop3_annotation/applicationContext.xml");
		
		MessageBean bean = context.getBean("targetBean",MessageBean.class);
		
		bean.sayHello();
		System.out.println("-----------------------------------");
		bean.engSayHello();
		System.out.println("-----------------------------------");
		bean.test();
		System.out.println("-----------------------------------");
	}
}
