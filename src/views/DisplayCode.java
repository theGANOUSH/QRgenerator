package views;

import java.awt.Graphics;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

public class DisplayCode extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3915797581516535645L;
	private static BufferedImage qrCode;
	/**
	 * Create the frame.
	 */
	public DisplayCode(BufferedImage image, String text) {
		setTitle(text);
		qrCode = image;
		setIconImage(Toolkit.getDefaultToolkit().getImage(DisplayCode.class.getResource("/views/TheTab_KGrgb_300ppi.png")));
		setBounds(100, 100, qrCode.getWidth(), qrCode.getHeight());
		
		

	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawImage(qrCode, 0, 0, null);
		
	}

}
