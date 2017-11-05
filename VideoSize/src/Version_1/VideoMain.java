package Version_1;

import javax.swing.JFrame;

public class VideoMain {
	public static void main(String args[]) {
		MyFrame r = new MyFrame("Video_Size");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(450, 600);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
	}
}
