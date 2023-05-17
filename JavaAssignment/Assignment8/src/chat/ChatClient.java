package chat;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.*;



public class ChatClient extends JFrame implements Runnable {

	private static int WIDTH = 400;
	private static int HEIGHT = 300;
	private JTextField textField = null;
	private JTextArea textArea = null;
	private DataOutputStream toServer = null;
	private DataInputStream fromServer = null;

	private Socket socket = null;


	
	public ChatClient() {
		super("Chat Client");
		this.setSize(ChatClient.WIDTH, ChatClient.HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		this.setVisible(true);

		textField = new JTextField(5);
		textArea = new JTextArea(300,200);
		this.setLayout(new BorderLayout());
		
		textField.addActionListener(new TextFieldListener());

		this.add(textArea, BorderLayout.CENTER);
		this.add(textField, BorderLayout.SOUTH);
		
	}
	private void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem exitItem = new JMenuItem("Exit");

		exitItem.addActionListener((e) -> System.exit(0));
		menu.add(exitItem);
		menuBar.add(menu);
		this.setJMenuBar(menuBar);
	}

	public void run() {
		try {
			socket = new Socket("localhost", 8000);
			textArea.append("connected\n");
		} catch (IOException e1) {
			e1.printStackTrace();
			textArea.append("connection Failure");
		}
		try {
			fromServer = new DataInputStream(socket.getInputStream());
			
		}catch (IOException ex) {
			textArea.append(ex.toString() + '\n');
		}
		while(true) {
			System.out.println("communication succeed");
			try {
			   String content = fromServer.readUTF();
			   textArea.append(content + "\n");
			   
			}catch (IOException ex) {
		        System.err.println(ex);
			}
		}

	}

		
	class TextFieldListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		    try {
				toServer = new DataOutputStream(socket.getOutputStream());
				
			}catch (IOException ex) {
				textArea.append(ex.toString() + '\n');
			}
			    
			try {
			    String output = textField.getText().trim();
			    //System.out.println(output);
			    textField.setText("");
			    toServer.writeUTF(output);
			    toServer.flush();

			 }catch (IOException ex) {
			        System.err.println(ex);
			 }			
		}
	}
	
	public static void main(String[] args) {
		ChatClient chatClient = new ChatClient();
		new Thread(chatClient).start();
	}
}
