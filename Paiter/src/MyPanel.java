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
		colors[1] = Color.GREEN;
		colors[2] = Color.BLUE;
		colors[3] = Color.RED;
		colors[4] = Color.YELLOW;
		colors[5] = Color.WHITE;
		colors[6] = Color.ORANGE;
	
	}
	
	public void paintComponent(Graphics gr){
		for(int i = 0; i < 7; i++){
			gr.setColor(colors[i]);
			gr.fillRect(i*100, 0, 100, 50);
		}
		
		if(isDrawing == true){
			gr.setColor(colors[colorIndex]);
			gr.fillRect(mouseX, mouseY, 3, 3);
		}
	}
	
	class MyMouse1 implements MouseListener{
		public void mouseClicked(MouseEvent e){
			
		}
		
		public void mousePressed(MouseEvent e){
				int tX = e.getX();
				int tY = e.getY();
				int count = e.getClickCount();
				int btn = e.getButton();
				
				if(tX > 0 && tX < 700 && tY > 0 && tY < 50){
					if(count == 1){
						if(btn == 1){
							colorIndex = tX / 100;
						}
					}
				}
		}
		
		public void mouseReleased(MouseEvent e){
			isDrawing = false;
		}
		
		public void mouseEntered(MouseEvent e){
			
		}
		
		public void mouseExited(MouseEvent e){
				
		}
	}

	class MyMouse2 implements MouseMotionListener{
		public void mouseDragged(MouseEvent e){
			int tX = e.getX();
			int tY = e.getY();
			if(tY > 50){
				mouseX = tX;
				mouseY = tY;
				isDrawing = true;
				repaint();
			}
		}
		
		public void mouseMoved(MouseEvent e){
			int tX = e.getX();
			int tY = e.getY();
			
			if(tX > 0 && tX < 700 && tY > 0 && tY < 50){
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}else{
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		}
	}
	
}