package springcore.xmlconfig;

import org.springframework.stereotype.Component;

@Component
public class TextMessage implements IMessageService {
	@Override
	public void sendText(String text, String to) {
		System.out.println("Sending Text Message "+ text + " to " + to);
	}
}
