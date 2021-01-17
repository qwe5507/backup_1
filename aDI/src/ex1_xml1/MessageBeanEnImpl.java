package ex1_xml1;

public class MessageBeanEnImpl implements MessageBean{

	public MessageBeanEnImpl() {
		super();
		System.out.println("MessageBeanEnImpl 생성됨 ");
	}
	
	@Override
	public void sayHello(String name) {
		System.out.println(name + ", Good Morning");
	}
}
