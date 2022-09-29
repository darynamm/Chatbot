package control.controller;

import chat.model.Chatbot;
import java.util.Scanner;
public class Controller
{
	private Chatbot chatbot;
	private Scanner keyboardInput;

	public Controller()
	{
	this.chatbot = new Chatbot("Super smart chatbot tbh");
		this.keyboardInput = new Scanner(System.in);
	}
	public void start()
	{
		System.out.println("Let's talk to the chatbot");
		String text = keyboardInput.nextLine();
		
		while (!text.equalsIgnoreCase("shutdown "))
		{
			String chatbotResponse = interactWithChatbot(text);
			System.out.println("Chatbot says: ");
			System.out.println(chatbotResponse);
			text = keyboardInput.nextLine();
		}
		keyboardInput.close();
	}
	private String interactWithChatbot(String userText)
	{
		String response = "";
		response = chatbot.processText(userText);
		return response;
	}
}

