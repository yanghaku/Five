package Main;

import java.awt.Toolkit;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.Image;

public class ChessBoard extends JPanel{
	public static final int MARGIN =15;//边距
	public static final int SPAN =25;//网格宽度
	public static final int ROWS =25;//棋盘行数
	public static final int COLS =25;//棋盘列数
	Image img;
	public ChessBoard() {
		img=Toolkit.getDefaultToolkit().getImage("D:\\Tu\\ps高光素材\\高光 (11).jpg");
	}
	//画棋盘
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(img,0,0,660,670,this);
		for(int i=0;i<=ROWS;i++) {
			g.drawLine(MARGIN,MARGIN+i*SPAN,
					MARGIN+COLS*SPAN,MARGIN+i*SPAN);
		}
		for(int i=0;i<=COLS;i++) {
			g.drawLine(MARGIN+i*SPAN,MARGIN,
					MARGIN+i*SPAN,MARGIN+ROWS*SPAN);
		}
		g.fillRect(MARGIN+3*SPAN-2,MARGIN+3*SPAN-2,5,5);
		g.fillRect(MARGIN+(COLS/2)*SPAN-2,MARGIN+3*SPAN-2,5,5);
		g.fillRect(MARGIN+(COLS-3)*SPAN-2,MARGIN+3*SPAN-2,5,5);
		g.fillRect(MARGIN+3*SPAN-2,MARGIN+(ROWS/2)*SPAN-2,5,5);
		g.fillRect(MARGIN+(COLS/2)*SPAN-2,MARGIN+(ROWS/2)*SPAN-2,5,5);
		g.fillRect(MARGIN+(COLS-3)*SPAN-2,MARGIN+(ROWS-3)*SPAN-2,5,5);
		g.fillRect(MARGIN+(COLS/2)*SPAN-2,MARGIN+(ROWS-3)*SPAN-2,5,5);
		g.fillRect(MARGIN+(COLS-3)*SPAN-2,MARGIN+(ROWS-3)*SPAN-2,5,5);
		Chess c1=new Chess(this,2,1,Color.BLACK);
		Chess c2=new Chess(this,2,2,Color.WHITE);
		c1.draw(g);
		c2.draw(g);
	}
	public Dimension getPreferredSide() {
		return new Dimension(MARGIN*2+SPAN*COLS,MARGIN*2+SPAN*ROWS);
	}
}
