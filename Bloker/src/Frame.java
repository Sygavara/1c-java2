import java.awt.*;
import  javax.swing.*;

public class Frame extends JFrame {
	private Timer timer;
	private JTextArea textArea;
	private boolean flagExtit = false;
	
	private void setWindow(){
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension = toolkit.getScreenSize();
		setBounds(0, 0, dimension.width, dimension.height);
	}
}