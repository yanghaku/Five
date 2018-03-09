package Main;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Five extends JFrame {
	private JToolBar toolbar;
	private JButton startButton,backButton,exitButton;
	private ChessBoard boardPanel;
	public Five() {
		super("����������");
		toolbar=new JToolBar();
		startButton=new JButton("���¿�ʼ");
		backButton=new JButton("����");
		exitButton=new JButton("�˳�");
		toolbar.add(startButton);
		toolbar.add(backButton);
		toolbar.add(exitButton);
		toolbar.setFloatable(false);
		this.add(toolbar, BorderLayout.NORTH);
		this.setBounds(400, 70, 670, 730);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		boardPanel =new ChessBoard();
		this.add(boardPanel, BorderLayout.CENTER);
		this.setResizable(false);
	}
	public static void main(String[] args)
	{
		new Five(); 
	}

}
