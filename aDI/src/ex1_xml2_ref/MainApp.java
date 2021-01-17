package ex1_xml2_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("ex1_xml2_ref/applicationContext.xml");
		
//		MemberBean bean = context.getBean("member",MemberBean.class);
//		bean.output();
//		
//		MemberBean bean2 = context.getBean("member2",MemberBean.class);
//		bean.output();
		
//		MemberDAO dao = context.getBean("dao",MemberDAO.class);
//		dao.insert();
		System.out.println("-1-");
		MemberDAO dao2 = context.getBean("dao2",MemberDAO.class);
		System.out.println("-2-");
		dao2.insert();
	}

}
