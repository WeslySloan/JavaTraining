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

// import 참조 되는 객체를 ctrl + shift + o로 손쉽게 참조 가능함.

public class Game extends JFrame
{
	// 더블 버퍼링 기술을 쓰기 위한 이미지 변수
	private Image screenImage;
	private Graphics screenGraphic;

	// 첫 시작화면의 배경화면을 객체에 넣어주기
	private Image Background = new ImageIcon(Main.class.getResource("../images/IntroBackground.jpg")).getImage(); // 첫 시작화면의 배경화면을 담을 수 있는 객체
	
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
		setUndecorated(true); // 기본적인 메뉴바 지우기
		setTitle("Ping&Pong"); // 게임 타이틀 이름
		setSize(Main.screen_width, Main.screen_height); // 스크린 사이즈 변수 가져오기
		setResizable(false); // 사용자가 임의적으로 스크린 사이즈 변경 불가능하게 만들기
		setLocationRelativeTo(null); // 스크린이 컴퓨터 화면 정중앙에 뜨게 하기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 게임을 끄면 프로그램도 꺼지게 하기
		setVisible(true); // 게임 스크린이 화면에 보이도록 하기
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
		
		// 소리 객체 끌고 오기
		Music introMusic = new Music("introMusic.mp3" , true);
		introMusic.start();
		
	}

	public void paint(Graphics g)
	{
		screenImage = createImage(Main.screen_width, Main.screen_height); // 스크린 크기의 이미지 박스를 만들기
		screenGraphic = screenImage.getGraphics(); // 그래픽 객체 얻어오기
		screenDraw(screenGraphic); // 스크린 이미지 그리기
		g.drawImage(screenImage, 0, 0, null); // 게임 창에 x:0 , y:0 지점부터 그래픽을 그리기
	}
	
	public void screenDraw(Graphics g)
	{
		g.drawImage(Background, 0, 0, null); // screenImage라는 이미지 박스에 x:0 , y:0 위치부터 IntroBackground에 해당하는 이미지 그리기
		paintComponents(g);
		this.repaint(); // 지속적인 이미지 유지
		
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
			g.drawString("2학년 2학기", 380, 300);
			g.drawString("모두 수고하셨습니다!", 50, 700);
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