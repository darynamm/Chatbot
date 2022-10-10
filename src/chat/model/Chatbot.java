package chat.model;

import java.util.ArrayList;

import monster.model.MarshmallowMonster;

public class Chatbot
{
	private String chatbotName;
	private String userName;

	public Chatbot(String chatbotName)
	{
		this.chatbotName = chatbotName;
		this.userName = "";

	}

	public String processText(String input)
	{
		String output = reversePronounDirection(input);

		return output;
	}

	private boolean spookyChecker(String text)
	{

		boolean isSpooky = false;
		ArrayList<String> spookyStuff = new ArrayList<String>();
		spookyStuff.add("Halloween");
		spookyStuff.add("smile");
		spookyStuff.add("joker");
		spookyStuff.add("spiders");
		spookyStuff.add("clown");
		spookyStuff.add("werewolf");
		spookyStuff.add("vampire");
		spookyStuff.add("dracula");
		spookyStuff.add("ghost");
		spookyStuff.add("antman");
		for (String phrase : spookyStuff)
		{
			if (text.toLowerCase().indexOf(phrase.toLowerCase()) >= 0)
			{
				isSpooky = true;
			}
			else
			{
				isSpooky = false;
			}
		}

		return isSpooky;
	}

	private String spookyResponse()
	{
		String response = "i am spooked!";

		return response;
	}

	private boolean isValidHTMLChecker(String text)
	{
		boolean isValid = false;

		return isValid;
	}

	private String isValidHTMLResponse()
	{
		String response = "This is valid HTML";
		return response;
	}

	private String reversePronounDirection(String source)
	{
		String response = source.replace("i", "you ");
		response = response.replace("you", "i");
		response = response.replace("am", "are");
		response = response.replace("are", "am");
		response = response.replace("uh", "ah");

		return response;
	}
}
