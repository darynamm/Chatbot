package chat.model;

public class Chatbot
{
private String chatbotName;
private String userName;

public Chatbot(String chatbotName)
{
	this.chatbotName = chatbotName;
	this.userName = "";

}

public String processText(String input) {
	String output = reversePronounDirection(input);
	
	return output;
}
private boolean spookyChecker(String text)
{
	boolean isSpooky = false;
	
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
	 String response = source.replace("I", "You ");
	 return response;
 }
}
