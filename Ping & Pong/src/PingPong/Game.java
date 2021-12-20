package PingPong;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// import ���� �Ǵ� ��ü�� ctrl + shift + o�� �ս��� ���� ������.

public class Game extends JFrame
{
	// ���� ���۸� ����� ���� ���� �̹��� ����
	private Image screenImage;
	private Graphics screenGraphic;

	// ù ����ȭ���� ���ȭ���� ��ü�� �־��ֱ�
	private Image Background = new ImageIcon(Main.class.getResource("../images/IntroBackground.jpg")).getImage(); // ù ����ȭ���� ���ȭ���� ���� �� �ִ� ��ü
	
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.jpg")));
	private JButton exitButton = new JButton(new ImageIcon(Main.class.getResource("../images/exitButton.jpg")));
	private JButton startButton = new JButton(new ImageIcon(Main.class.getResource("../images/startButton.jpg")));
	private JButton quitButton = new JButton(new ImageIcon(Main.class.getResource("../images/quitButton.jpg")));
	private JButton eggButton = new JButton(new ImageIcon(Main.class.getResource("../images/eggButton.jpg")));
	
	private int mouseX, mouseY;
	static Ball b = new Ball(250, 200);
	private boolean trigger = true;
	private boolean eggtrigger = true;
	
	public Game ()
	{
		setUndecorated(true); // �⺻���� �޴��� �����
		setTitle("Ping&Pong"); // ���� Ÿ��Ʋ �̸�
		setSize(Main.screen_width, Main.screen_height); // ��ũ�� ������ ���� ��������
		setResizable(false); // ����ڰ� ���������� ��ũ�� ������ ���� �Ұ����ϰ� �����
		setLocationRelativeTo(null); // ��ũ���� ��ǻ�� ȭ�� ���߾ӿ� �߰� �ϱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ ���� ���α׷��� ������ �ϱ�
		setVisible(true); // ���� ��ũ���� ȭ�鿡 ���̵��� �ϱ�
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		addKeyListener(new AL());
		
		exitButton.setBounds(1560, 0, 40, 40);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent e)
			{
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				System.exit(0);
			}
		});
		add(exitButton);
		
		startButton.setBounds(100, 440, 450, 100); 
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		startButton.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent e)
			{
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				startButton.setVisible(false);
				quitButton.setVisible(false);
				eggButton.setVisible(false);
				
				trigger = false;
				
				Background = new ImageIcon(Main.class.getResource("../images/GameBackground.jpg")).getImage();
				
				Thread ball = new Thread(b);
				ball.start();
				Thread p1 = new Thread(b.p1);
				Thread p2 = new Thread(b.p2);
				p2.start();
				p1.start();
			}
		});
		add(startButton);
		
		quitButton.setBounds(1100, 440, 450, 100);
		quitButton.setBorderPainted(false);
		quitButton.setContentAreaFilled(false);
		quitButton.setFocusPainted(false);
		quitButton.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent e)
			{
				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				System.exit(0);
			}
		});
		add(quitButton);
		
		menuBar.setBounds(0, 0, 1600, 40);
		menuBar.addMouseListener (new MouseAdapter()
				{
					@Override
					public void mousePressed(MouseEvent e)
					{
						mouseX = e.getX();
						mouseY = e.getY();
					}
				});
		menuBar.addMouseMotionListener(new MouseMotionAdapter()
		{
			@Override
			public void mouseDragged(MouseEvent e)
			{
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});
		add(menuBar);
		
		eggButton.setBounds(580, 100, 450, 100);
		eggButton.setBorderPainted(false);
		eggButton.setContentAreaFilled(false);
		eggButton.setFocusPainted(false);
		eggButton.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent e)
			{
				eggButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				eggButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				startButton.setVisible(false);
				quitButton.setVisible(false);
				eggButton.setVisible(false);
				
				eggtrigger = false;
				
				Background = new ImageIcon(Main.class.getResource("../images/GameBackground.jpg")).getImage();
			}
		});
		add(eggButton);
		
		// �Ҹ� ��ü ���� ����
		Music introMusic = new Music("introMusic.mp3" , true);
		introMusic.start();
		
	}

	public void paint(Graphics g)
	{
		screenImage = createImage(Main.screen_width, Main.screen_height); // ��ũ�� ũ���� �̹��� �ڽ��� �����
		screenGraphic = screenImage.getGraphics(); // �׷��� ��ü ������
		screenDraw(screenGraphic); // ��ũ�� �̹��� �׸���
		g.drawImage(screenImage, 0, 0, null); // ���� â�� x:0 , y:0 �������� �׷����� �׸���
	}
	
	public void screenDraw(Graphics g)
	{
		g.drawImage(Background, 0, 0, null); // screenImage��� �̹��� �ڽ��� x:0 , y:0 ��ġ���� IntroBackground�� �ش��ϴ� �̹��� �׸���
		paintComponents(g);
		this.repaint(); // �������� �̹��� ����
		
		if(trigger == false)
		{
			b.draw(g);
			b.p1.draw(g);
			b.p2.draw(g);
		
			g.setColor(Color.white);
			
			Font font = new Font("Times Roman" , Font.BOLD , 40);
			
			g.setFont(font);
			g.drawString(""+b.p1score, 700, 80);
			g.drawString(""+b.p2score, 870, 80);
			
			repaint();
		}
		
		if(eggtrigger == false)
		{
			g.setColor(Color.white);
			
			Font font = new Font("Times Roman" , Font.BOLD , 150);
			
			g.setFont(font);
			g.drawString("2�г� 2�б�", 380, 300);
			g.drawString("��� �����ϼ̽��ϴ�!", 50, 700);
		}
	}
	
	public class AL extends KeyAdapter
	{
		@Override
		public void keyPressed(KeyEvent e) {
			b.p1.keyPressed(e);
			b.p2.keyPressed(e);
		}
		@Override
		public void keyReleased(KeyEvent e) {
			b.p1.keyReleased(e);
			b.p2.keyReleased(e);
		}
	}
}