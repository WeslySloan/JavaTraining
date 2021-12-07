package banana;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Phone implements Client {
	Server server;
	JFrame frame;
	JTextArea in = new JTextArea();
	JTextArea out = new JTextArea();
	JButton sendButton = new JButton("º¸³»±â");
	
	public Phone(Server server, String name) {
		this.server = server;
		server.register(this);
		
		frame = new JFrame(name);
		Container pane = frame.getContentPane();
		pane.setLayout(new BorderLayout());
		pane.add(in, BorderLayout.PAGE_START);
		pane.add(out, BorderLayout.CENTER);
		pane.add(sendButton, BorderLayout.PAGE_END);
		
		sendButton.addActionListener(new MyListener());
		
		frame.setSize(120, 180);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void update(String msg) {
		// TODO Auto-generated method stub
		in.setText(msg);
	}
	
	private class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			server.newMsg(out.getText());
		}
	}
}
