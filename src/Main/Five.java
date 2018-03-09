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
		super("单机五子棋");
		toolbar=new JToolBar();
		startButton=new JButton("重新开始");
		backButton=new JButton("悔棋");
		exitButton=new JButton("退出");
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
