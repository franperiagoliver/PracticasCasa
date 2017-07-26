package com.house.study.java_.swim.components;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuFrame menuFrame = new MenuFrame();
		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuFrame.setVisible(true);

	}

}

@SuppressWarnings("serial")
class MenuFrame extends JFrame {

	public MenuFrame() {

		setBounds(500, 300, 550, 400);
		MenuPanel menuPanel = new MenuPanel();
		add(menuPanel);
	}

}

@SuppressWarnings("serial")
class MenuPanel extends JPanel {
	
	public MenuPanel() {
		
		JMenuBar bar = new JMenuBar();
		
		JMenu archive = new JMenu("Archive");
		JMenu edition = new JMenu("Edition");
		JMenu tools = new JMenu("Tools");
		JMenu options = new JMenu("Options");
		
		JMenuItem save = new JMenuItem("Save");
		JMenuItem saveAs = new JMenuItem("Save As");
		
		JMenuItem cut = new JMenuItem("Cut");
		JMenuItem copy = new JMenuItem("Copy");
		JMenuItem paste = new JMenuItem("Paste");
		
		JMenuItem general = new JMenuItem("General");
		
		JMenuItem option1 = new JMenuItem("Option 1");
		JMenuItem option2 = new JMenuItem("Option 2");
		
		archive.add(save);
		archive.add(saveAs);
		
		edition.add(cut);
		edition.add(copy);
		edition.add(paste);
		edition.addSeparator();
		
		edition.add(options);
		options.add(option1);
		options.add(option2);
		
		tools.add(general);
		
		bar.add(archive);
		bar.add(edition);
		bar.add(tools);
		
		add(bar);
		
	}
	
}