package chat.model;

import java.util.ArrayList;

public class Chatbot
{
	private String chatbotName;
	private String userName;
	
	private String [] chatTopics;
	
	private ArrayList<String> riddleList; 
	private ArrayList<String> answerList; 
private ArrayList<String> jokeList;
	public Chatbot(String chatbotName)
	{
		this.chatbotName = chatbotName;
		this.userName = "";
		riddleList = new ArrayList<String>();
		answerList = new ArrayList<String>();	
		jokeList = new ArrayList<String>();
		loadTopic();

	}
	
	private void loadTopic()
	{
		String topicOne = "do you like spicy food?? i do!";
		String topicTwo = "i love snickers, whats your favorite candy bar??";
		String topicThree = "do you like kitties or puppies better?";
		String topicFour = "have you seen finding dory?? ";
		String topicFive = "im watching pretty little liars right now, what are you watching?";
		String topicSix = "what is your favorite book? one of mine is the good girls guide to murder!";
		String topicSeven = "what is your favorite holiday";
		String topicEight = "how much college credit does this class grant again???";
		String topicNine = "i want to go to the u, where do you want to go??";
		String topicTen = "do you like the boba at kung fu tea? ";
	}

	public String processText(String input)
	{
		String output = "";
		
		int randomMethod = (int) (Math.random() * 6);
		if (randomMethod == 0)
		{
			output = reversePronounDirection(input);
		}
		else if (randomMethod == 1)
		{
			if (spookyChecker(input))
			{
				output += "\n" + spookyResponse() + "\n";
			}
			else 
			{
				output += "\n" + "That isnt very spooky";
			}
		}
		else if (randomMethod == 2)
		{
			if (isValidHTMLChecker(input))
			{
				output += "\n" + isValidHTMLResponse() + "\n";
			}
			else 
			{
				output += "\n" + "No HTML here :(" + "\n";
			}
		}
		else if (randomMethod == 3)
		{
			output = answerRiddle(input);
		}
		else if(randomMethod == 4)
		{
			//joke list or other
		}
		else
		{
			//joke list or oher
		}
		int randomTopic = (int) (Math.random() * chatTopics.length);
		output += "\n" + chatTopics[randomTopic];

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
private String groanJoke(String text)
{
	jokeList.add("I came to the hospital because I accidentally swallowed invisible ink. I'm still waiting to be seen.");
	jokeList.add("What is the difference between a cat and a comma? A cat has claws at the end of his paws, whereas a comma is a pause at the end of a clause.");
	jokeList.add("Doctor: Your body has run out of magnesium. Me: 0mg.");
	jokeList.add("I don't like the way my kids are always quick to blame other people. They get that from their mum.");
	jokeList.add("What's the best thing about Switzerland? I'm not sure, but the flag is a big plus.");
	jokeList.add("Did you hear about the restaurant on the moon? Great food, no atmosphere");
	jokeList.add("I was wondering why this frisbee kept looking bigger and bigger. Then it hit me.");
	jokeList.add("Within minutes the detectives knew what the murder weapon was. It was a brief case.");
	jokeList.add("This ham sandwich walks into a bar and orders a drink. The bartender says, “Sorry, we don’t serve food here.”");
	jokeList.add("Did you know the first French fries weren’t really cooked in France? They were cooked in Grease! (Greece)");
	
	return "";
}
	private String answerRiddle(String text)
	{
		
		riddleList.add("How do you spell COW in thirteen letters?");
		riddleList.add("There are two monkeys on a tree and one jumps off. Why does the other monkey jump too?");
		riddleList.add("There are 30 cows in a field, and 28 chickens. How many didn't?");
		riddleList.add("Why did Snap, Crackle and Pop get scared?");
		riddleList.add(" If two snakes marry, what will their towels say?");
		riddleList.add("What do you call a fish with two knees?");
		riddleList.add("What do you call a man with a rubber toe?");
		riddleList.add("What does a house wear?");

		
		answerList.add("SEE O DOUBLE YOU.");
		answerList.add("Monkey see monkey do.");
		answerList.add(
				"10. Listen closely: 30 cows, and twenty-eight chickens. Say EIGHT and ATE. They sound the same. Therefore, it means 20 ATE chickens. 30-20=10, so 10 cows didn't eat any chickens.");
		answerList.add("They heard there was a cereal killer on the loose.");
		answerList.add("Hiss and Hers.");
		answerList.add("A tuna (two-knee) fish!");
		answerList.add("Roberto.");
		answerList.add("Address! (A dress)");
		
		
		return "";
	}


	private String spookyResponse()
	{
		String response = "i am spooked!";
		String response2 = "halloween is coming up after all!";
		String response3 = "shivers!";
		String response4 = "i am one scaredy cat";
		String response5 = "ahhhh thats scaryyy";

		int myRandom = (int) (Math.random() * 10);
		if (myRandom == 1 || myRandom == 2)
		{
			return response;
		}
		else if (myRandom == 3 || myRandom == 4)
		{
			return response2;
		}
		else if (myRandom == 5 || myRandom == 6)
		{
			return response3;
		}
		else if (myRandom == 7 || myRandom == 8)
		{
			return response4;
		}
		else
		{
			return response5;
		}
	}
	
	private void workWithIntArray(int [] numbers)
	{
		int favoriteNumber = 13;
		numbers [0] = favoriteNumber;
		numbers [numbers.length - 1] = favoriteNumber;
		
		for (int index = 0; index < numbers.length; index ++)
		{
			System.out.println("Index" + index + ": contains: " + numbers[index]);
		}
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
				{
					String response = "i love that holiday";
				}
				String HolidayChecker;

			}
			else
			{
				isHoliday = false;
			}
		}

		return isHoliday;
	}

	private boolean isValidHTMLChecker(String phrase)
	{
		boolean isValid = false;
		if (!phrase.contains("<") || !phrase.contains(">"))
		{
			return isValid;
		}
		else
		{
			int openTagStartIndex = phrase.indexOf("<");
			int openTagEndIndex = phrase.indexOf(">", openTagStartIndex);

			if (openTagStartIndex < openTagEndIndex)
			{
				String keyword = phrase.substring(openTagStartIndex + 1, openTagEndIndex);
				int openTagStart = phrase.indexOf("<" + keyword + ">");

				int closeTagStartIndex = phrase.indexOf("</");
				int closeTagEndIndex = phrase.indexOf(">", closeTagStartIndex);

				if (closeTagStartIndex > openTagEndIndex && closeTagEndIndex > closeTagStartIndex)
				{
					String closingKeyword = phrase.substring(closeTagStartIndex + 2,openTagEndIndex);
					int closetagStart = phrase.indexOf("<" + closingKeyword + ">", openTagEndIndex);
					int spaceIndex = keyword.indexOf(" ");
					if (spaceIndex != -1)
					{
						keyword = keyword.substring(0, spaceIndex);
						if (keyword.equals(closingKeyword))
						{
							isValid = true;
						}
					}
				}
			}
		}
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
