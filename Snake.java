package snakev2;

import javax.swing.JFrame;

public class Snake extends JFrame{
	
	public Snake() {
		add (new Board());
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(960, 740);
		setLocationRelativeTo(null);
		setTitle("Snake");
		
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Snake();
	}

}