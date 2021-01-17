package ex1_xml3_pvalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ex1_xml3_pvalue/applicationContext.xml");
		
		MemberBean b = context.getBean("bean",MemberBean.class);
		b.output();
		
		MemberDAO d = context.getBean("memberdao",MemberDAO.class);
		d.insert();
	}

}
