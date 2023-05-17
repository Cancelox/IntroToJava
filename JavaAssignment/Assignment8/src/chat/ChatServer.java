package chat;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.swing.*;




public class ChatServer extends JFrame implements Runnable {

	private static int WIDTH = 400;
	private static int HEIGHT = 300;
	private JTextArea ta;
	private int clientNo = 0;
	private Set<HandleAClient> userThreads = new HashSet<>();
	
	public ChatServer() {
		super("Chat Server");
		
		ta = new JTextArea(10,10);
		JScrollPane sp = new JScrollPane(ta);
		this.add(sp);
		

		Thread t = new Thread(this);
		t.start();
		
		this.setTitle("ChatServer");
		this.setSize(ChatServer.WIDTH, ChatServer.HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		createMenu();
		this.setVisible(true);
		
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
	

	public static void main(String[] args) {
		ChatServer chatServer = new ChatServer();
	}

	@Override
	public void run() {
		try {
	      // Create a server socket
	      ServerSocket serverSocket = new ServerSocket(8000);
	      ta.append("MultiThreadServer started at " + new Date() + '\n');
	    
	      while (true) {
	        // Listen for a new connection request
	        Socket socket = serverSocket.accept();
	        clientNo++;

	        ta.append("Starting thread for client " + clientNo + " at " + new Date() + '\n');

	          
	        // Create and start a new thread for the connection
	        HandleAClient userThread = new HandleAClient(socket, clientNo);
	        userThreads.add(userThread);
	        new Thread(userThread).start();
	      }
	    }catch(IOException ex) {
	      System.err.println(ex);
	    }
		    
	}
	
	  // Define the thread class for handling new connection
	  class HandleAClient implements Runnable {
	    private Socket socket; // A connected socket
	    private int clientNum;
	    //private BufferedReader inputFromClient;
	    private DataInputStream inputFromClient;
	    private DataOutputStream outputToClient;

	    public HandleAClient(Socket socket, int clientNum) {
	      this.socket = socket;
	      this.clientNum = clientNum;
	    }


	    public void run() {
	      try {
	        // Create data input and output streams
	        //this.inputFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	    	this.inputFromClient = new DataInputStream(socket.getInputStream());
	        this.outputToClient = new DataOutputStream(socket.getOutputStream());

	        // Continuously serve the client
	        while (true) {
	          String input = inputFromClient.readUTF();
	          //System.out.println(input);
	          
	          // Send back to the client
	          outputToClient.writeUTF(input);
	          for(HandleAClient user : userThreads) {
	        	  if(user != this)
	        		  user.getDataOutputStream().writeUTF("clientNum" + clientNum + ": " + input); 
	          }
	          
	          ta.append("client: " + this.clientNum + ": " + input + '\n');
	          
	        }
	      }
	      catch(IOException ex) {
	        ex.printStackTrace();
	      }
	    }
	    
	    public DataOutputStream getDataOutputStream() {
	    	return outputToClient;
	    }
	  }
	
}


