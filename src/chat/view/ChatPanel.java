package chat.view;
import chat.controller.Controller;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.GridLayout;

public class ChatPanel extends JPanel
{

	private Controller app;
	
	private SpringLayout layout;
	
	private JButton reversePronounButton;
	private JButton htmlButton;
	private JButton holidayButton;
	private JButton arrayButton;
	private JButton spookyButton;
	private JButton riddleButton;
	private JButton groanButton;
	private JButton processTextButton;
	private JButton loadButton;
	private JButton saveButton;
	private JButton chatButton;
	
	
	private JPanel chatButtonsPanel;
	private JPanel saveLoadPanel;
	private JPanel menuPanel;
	
	private JTextField chatField;
	private JScrollPane chatPane;
	private JTextArea chatArea;
	
	
	public ChatPanel(Controller app)
	{
		super();
		this.app = app;
		
		this.layout = new SpringLayout();
		
		this.reversePronounButton = new JButton("Reverses Pronouns!");
		this.htmlButton = new JButton("HTML checker!");
		this.holidayButton = new JButton("Holidayy seasonn");
		this.arrayButton = new JButton("Arrays");
		this.spookyButton = new JButton("Spooky");
		this.riddleButton = new JButton("Riddles");
		this.groanButton = new JButton("Groan Jokes");
		this.processTextButton = new JButton("Process Text button");
		this.loadButton = new JButton("Load!");
		this.saveButton = new JButton("Save");
		this.chatButton = new JButton("Chat");
		
		
		this.chatButtonsPanel = new JPanel(new GridLayout(1,0));
		this.saveLoadPanel = new JPanel(new GridLayout(1,0));
		this.menuPanel = new JPanel(new GridLayout(0,1));
		
		this.chatField = new JTextField("Type here to chat");
		this.chatPane = new JScrollPane();
		this.chatArea = new JTextArea();
		
		setupPanel();
		setupListeners();
		setupLayout();
		
	}
	private void setupPanel()
	{
		this.setLayout(layout); 
		this.setBackground(new Color (147, 112, 219));
		
		menuPanel.add(chatField);
		menuPanel.add(chatButtonsPanel);
		menuPanel.add(chatButton);
		menuPanel.add(saveLoadPanel);
		
		
		chatButtonsPanel.add(holidayButton);
		chatButtonsPanel.add(reversePronounButton);
		chatButtonsPanel.add(htmlButton);
		chatButtonsPanel.add(arrayButton);
		chatButtonsPanel.add(spookyButton);
		chatButtonsPanel.add(riddleButton);
		chatButtonsPanel.add(groanButton);
		chatButtonsPanel.add(processTextButton);

		chatButtonsPanel.add(chatButton);
		
		saveLoadPanel.add(saveButton);
		saveLoadPanel.add(loadButton);
		
		chatPane.setViewportView(chatArea);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		chatArea.setEditable(false);
		
		
		
		this.add(chatPane);
		this.add(menuPanel);
		
	}
	private void setupListeners()
	{
		
	}
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.WEST, chatPane, 50, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, chatPane, 25, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, chatPane, -50, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.SOUTH, chatPane, -200, SpringLayout.SOUTH, this);
		
		layout.putConstraint(SpringLayout.WEST, menuPanel, 0, SpringLayout.WEST, chatPane);
		layout.putConstraint(SpringLayout.EAST, menuPanel, 0, SpringLayout.WEST, chatPane);
		layout.putConstraint(SpringLayout.NORTH, menuPanel, 25, SpringLayout.SOUTH, chatPane);
		layout.putConstraint(SpringLayout.SOUTH, menuPanel, -25, SpringLayout.SOUTH, this);
		
	}
	

	
}
