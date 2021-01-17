package ex2_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex2_annotation/applicationContext.xml");
		
		//***************** 빈이름 (객체명)은 자동으로 동일한 이름으로 하되 첫글자가 소문자 
		MemberDAO dao = context.getBean("dao",MemberDAO.class);
		dao.insert();
	}	

}
