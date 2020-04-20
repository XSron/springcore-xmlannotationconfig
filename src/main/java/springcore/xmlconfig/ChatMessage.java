package springcore.xmlconfig;

import org.springframework.stereotype.Component;

@Component
public class ChatMessage implements IMessageService {
	@Override
	public void sendText(String text, String to) {
		System.out.println("Sending Chat Message "+ text + " to " + to);
	}
}
