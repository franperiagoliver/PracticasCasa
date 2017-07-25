package com.house.study.java_.swim.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PasswordField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PassFrame passFrame = new PassFrame();
		passFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

@SuppressWarnings("serial")
class PassFrame extends JFrame {

	public PassFrame() {

		setBounds(400, 300, 550, 400);

		PassSheet passSheet = new PassSheet();

		add(passSheet);
		setVisible(true);
	}

}

@SuppressWarnings("serial")
class PassSheet extends JPanel {

	private JPasswordField cPass;

	public PassSheet() {

		setLayout(new BorderLayout());

		JPanel superiorSheet = new JPanel();

		superiorSheet.setLayout(new GridLayout(2, 2));

		add(superiorSheet, BorderLayout.NORTH);

		JLabel label1 = new JLabel("User");
		JLabel label2 = new JLabel("Password");

		JTextField cUser = new JTextField(15);

		CheckPass listener = new CheckPass();

		cPass = new JPasswordField(15);

		cPass.getDocument().addDocumentListener(listener);

		superiorSheet.add(label1);
		superiorSheet.add(cUser);
		superiorSheet.add(label2);
		superiorSheet.add(cPass);

		JButton submit = new JButton("Submit");

		add(submit, BorderLayout.SOUTH);

	}

	private class CheckPass implements DocumentListener {

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub

			char[] password;

			password = cPass.getPassword();

			if (password.length < 8 || password.length > 12) {

				cPass.setBackground(Color.RED);

			} else {

				cPass.setBackground(Color.WHITE);
			}

		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			char[] password;

			password = cPass.getPassword();

			if (password.length < 8 || password.length > 12) {

				cPass.setBackground(Color.RED);

			} else {

				cPass.setBackground(Color.WHITE);
			}
		}

	}

}