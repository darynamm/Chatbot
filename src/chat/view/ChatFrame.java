package chat.view;
import chat.controller.Controller;
import javax.swing.JFrame;


public class ChatFrame extends JFrame
{
	
	private Controller app;
	private ChatPanel panel;
	
	public ChatFrame(Controller app)
	{
		super();
		this.app = app;
		this.panel = new ChatPanel(this.app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(panel);;
		this.setSize(1024,768);
		this.setTitle("Chatbot 2023");
		this.setResizable(true);
		this.setVisible(true);
	}

}
