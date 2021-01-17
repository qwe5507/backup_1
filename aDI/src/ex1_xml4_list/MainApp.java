package ex1_xml4_list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex1_xml4_list/applicationContext.xml");
		
		ListBean list = context.getBean("bean",ListBean.class);
		
		for(Integer i  :list.getInList()) {
			System.out.println(i);
		}
		
		for(MemberBean m : list.getMemberList()) {
			m.output();
		}
	}

}
