package springcore_annotationxmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcore.xmlconfig.IMessageService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		IMessageService chatService = context.getBean("chatMessage", IMessageService.class);
		IMessageService textService = context.getBean("textMessage", IMessageService.class);
		chatService.sendText("Hi", "Sakai");
		textService.sendText("Hi", "Sakai");
	}
}