/** Name: Austin Lowe
* Course: CNT 4714 Spring 2018
* Assignment title: Project 2 � Synchronized, Cooperating Threads Under Locking
* Due Date: February 11, 2018
*/
package common;

import java.awt.image.BufferedImage;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

/**
 * @author au965898
 *
 */
public class QR {
	
private static BufferedImage image;
	
	public static BufferedImage writeQRCode(String text) {
	    QRCodeWriter writer = new QRCodeWriter();
	    int width = 256, height = 256;
	    image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB); // create an empty image
	    int white = 255 << 16 | 255 << 8 | 255;
	    int black = 0;
	    try {
	        BitMatrix bitMatrix = writer.encode(text, BarcodeFormat.QR_CODE, width, height);
	        for (int i = 0; i < width; i++) {
	            for (int j = 0; j < height; j++) {
	                image.setRGB(i, j, bitMatrix.get(i, j) ? black : white); // set pixel one by one
	            }
	        }
	 
	    } catch (WriterException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
		return image;
	}

}
