import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyPanel extends JPanel{
	Color[] colors;
	int colorIndex = 0;
	int mouseX;
	int mouseY;
	boolean isDrawing = false;
	
	public MyPanel(){
		addMouseListener(new MyMouse1());
		addMouseMotionListener(new MyMouse2());
		
		colors = new Color[7];
		colors[0] = Color.BLACK;
		colors[2] = Color.GREEN;
		colors[3] = Color.BLUE;
		colors[4] = Color.YELLOW;
		colors[5] = Color.WHITE;
		colors[6] = Color.ORANGE;
	
	}
	
	public void paintComponent(Graphics gr){
		
	}
}

class MyMouse1 implements MouseListener{
	public void mouseClicked(MouseEvent e){
		
	}
	
	public void mousePressed(MouseEvent e){
			
	}
	
	public void mouseReleased(MouseEvent e){
		
	}
	
	public void mouseEntered(MouseEvent e){
		
	}
	
	public void mouseExited(MouseEvent e){
			
	}
}

class MyMouse2 implements MouseMotionListener{
	public void mouseDragged(MouseEvent e){
			
	}
	
	public void mouseMoved(MouseEvent e){
		System.out.println(e.getX() + " " + e.getY());
	}
}