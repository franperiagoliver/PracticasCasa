package com.house.study.java_.swim.graphics;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImagesTest {

	public static void main(String[] args) {

		ImageFrame imageFrame = new ImageFrame();

		imageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		imageFrame.setVisible(true);

	}
}

class ImageFrame extends JFrame {

	public ImageFrame() {

		setTitle("Frame with image");
		setBounds(750, 300, 300, 200);

		ImageSheet imageSheet = new ImageSheet();

		add(imageSheet);

	}

}

class ImageSheet extends JPanel {

	private Image image;

	public ImageSheet() {

		try {

			image = ImageIO.read(new File("src/resources/Foto.png"));

		} catch (IOException e) {

			System.out.println("The image doesn't find");

		}
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		// File myImage = new File("src/resources/candado.jpg");

		int width = image.getWidth(this);
		int height = image.getHeight(this);

		g.drawImage(image, 5, 5, null);

		for (int i = 0; i < 300; i++) {

			for (int j = 0; j < 200; j++) {

				if (i + j > 0) {

					g.copyArea(0, 0, width, height, i * width, j * height);
					
				}
			}
		}
	}

}