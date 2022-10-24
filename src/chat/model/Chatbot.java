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
private String answerRiddle(String text)
{
	ArrayList<String> riddleList = new ArrayList<String>();
	riddleList.add("How do you spell COW in thirteen letters?");
	riddleList.add("There are two monkeys on a tree and one jumps off. Why does the other monkey jump too?");
	riddleList.add("There are 30 cows in a field, and 28 chickens. How many didn't?");
	riddleList.add("Why did Snap, Crackle and Pop get scared?");
	riddleList.add(" If two snakes marry, what will their towels say?");
	riddleList.add("");
	riddleList.add("");
	riddleList.add("");
	
	ArrayList<String> answerList = new ArrayList<String>();
	answerList.add("SEE O DOUBLE YOU.");
	answerList.add("Monkey see monkey do.");
	answerList.add("10. Listen closely: 30 cows, and twenty-eight chickens. Say EIGHT and ATE. They sound the same. Therefore, it means 20 ATE chickens. 30-20=10, so 10 cows didn't eat any chickens.");
	answerList.add("They heard there was a cereal killer on the loose.");
	answerList.add("Hiss and Hers.");
	answerList.add("");
	answerList.add("");
	answerList.add("");
	}
i
	public String spookyResponse()
	{
		String response = "i am spooked!";

		return response;
	}
private boolean holidayChecker(String text)
{

	boolean isHoliday = false;
	ArrayList<String> HolidayStuff = new ArrayList<String>();
	HolidayStuff.add("halloween");
	HolidayStuff.add("christmas");
	HolidayStuff.add("easter");
	HolidayStuff.add("birthday");
	HolidayStuff.add("thanksgiving");
	HolidayStuff.add("national ice cream day");
	HolidayStuff.add("mother's day");
	HolidayStuff.add("father's day");
	HolidayStuff.add("april fools");
	HolidayStuff.add("4 of july");
	for (String phrase : HolidayStuff)
	{
		if (text.toLowerCase().indexOf(phrase.toLowerCase()) >= 0)
		{
			isHoliday = true;
			String HolidayChecker;
			
		}
		else
		{
			isHoliday = false;
		}
	}

	return isHoliday;
}

	private boolean isValidHTMLChecker(String text)
	{
		boolean isValid = false;

		return isValid;
	}

	private String isValidHTMLResponse()
	{
		int openTagOpenBracketIndex = 0;
		int openTagCloseBracketIndex = 0;
		int openTagStartIndex = 1;
		
		String openingTag;
		String closingTag;
		String keyword;
		
		int closeTagOpenBracketIndex;
		int closeTagCloseBracketIndex;
		int closeTagStartIndex;
		
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
