import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame(){
		setBounds(0, 0, 800, 600);
		setTitle("���������� ����������� � ������� ����");
		
		MyPanel myPanel = new MyPanel();
		Container cont = getContentPane();
		cont.add(myPanel);
		
		setFocusable(true);
		setVisible(true);
	}
}