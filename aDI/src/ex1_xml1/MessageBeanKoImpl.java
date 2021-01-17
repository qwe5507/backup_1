package ex1_xml1;

public class MessageBeanKoImpl implements MessageBean {
	
	public MessageBeanKoImpl() {
		super();
		System.out.println("MessageBeanKoImpl 생성됨");
	}
	
	@Override
	public void sayHello(String name) {
		System.out.println("안녕하세요," + name);
	}

}
