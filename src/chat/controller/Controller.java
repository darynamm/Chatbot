package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatFrame;
import chat.view.Popup;


public class Controller 
{
	private Chatbot chatbot;
	private Popup view;
	private ChatFrame window;
	

	public Controller()
	{
	this.chatbot = new Chatbot("Super smart chatbot tbh");
	
		this.view = new Popup();
		this.window = new ChatFrame(this);
	}
	public void start()
	{
String text = view.askQuestion("Lets talk to the chatbot!");
//		System.out.println("Let's talk to the chatbot");
//		String text = keyboardInput.nextLine();
		
		while (!text.equalsIgnoreCase("shutdown "))
		{
			String chatbotResponse = interactWithChatbot(text);
		//	System.out.println("Chatbot says: ");
		//	view.displayMessage("Chatbot says:" + chatbotResponse);
			//system.out.println(chatbotRespons);
			text = view.askQuestion("Chatbot says: " + chatbotResponse);
		}
		
	}
	
	private String interactWithChatbot(String userText)
	{
		String response = "";
		response = chatbot.processText(userText);
		return response;
	}
}

