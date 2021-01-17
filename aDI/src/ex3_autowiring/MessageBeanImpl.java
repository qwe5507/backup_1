package ex3_autowiring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class MessageBeanImpl implements MessageBean{
	
	
	//@Qualifier("outputer2")
	//@Resource(name ="outputer2")
	@Autowired
	private Outputer outputer;
	
	private String name;
	private String message;
	
	//setter 나 생성자로 값 지정
	// [5.1 이후] @Required은 안됨 
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public void sayHello() {
		System.out.println(name + "님께" + message);
		
		
		try {
			outputer.writeMessage(name + "님께" + message);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
