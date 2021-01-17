package ex1_xml1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
			// 0. POJO - 기존 자바 형식 
//			MessageBean bean = new MessageBeanImpl();
//			bean.sayHello("hong");
//			MessageBean bean2 = new MessageBeanKoImpl();
//			bean2.sayHello("홍");
			// 1. DI
			System.out.println("시작~~~");
			ApplicationContext context = new 
						ClassPathXmlApplicationContext("ex1_xml1/applicationContext.xml");
			System.out.println("시작2!!!!!!!!!!!");
			MessageBean bean =  (MessageBean) context.getBean("ko");
			bean.sayHello("홍길동");
			
			MessageBean bean1 =  (MessageBean) context.getBean("ko");
			bean1.sayHello("맹길동");
			
			MessageBean bean2 = context.getBean("en",MessageBean.class);
			bean.sayHello("gilja");
			//context.
			
	}

}
