package aop2_xml_order;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop2_xml_order/applicationContext.xml");

		MemberService service = context.getBean("targetBean",MemberService.class);
		service.register();
		service.update("홍길동");
		
	}

}
