package com.house.study.java_.swim.components;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class ProcesadorTextos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuProcesador marco = new MenuProcesador();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

@SuppressWarnings("serial")
class MenuProcesador extends JFrame {

	public MenuProcesador() {

		setTitle("Periasoft Word 1990");
		setBounds(500, 300, 550, 400);
		LaminaProcesador lamina = new LaminaProcesador();
		add(lamina);
		setVisible(true);
	}

}

@SuppressWarnings("serial")
class LaminaProcesador extends JPanel {

	private JTextPane area;
	private JMenu fuente, estilo, tamagno;
	private Font letras;

	public LaminaProcesador() {

		setLayout(new BorderLayout());

		JPanel laminaMenu = new JPanel();

		JMenuBar barra = new JMenuBar();

		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamagno = new JMenu("Tamaño");

		configurarMenu("Arial", "fuente", "Arial", 9, 10);
		configurarMenu("Courier", "fuente", "Courier", 9, 10);
		configurarMenu("Verdana", "fuente", "Verdana", 9, 10);

		configurarMenu("Negrita", "estilo", "", Font.BOLD, 1);
		configurarMenu("Cursiva", "estilo", "", Font.ITALIC, 1);

		configurarMenu("12", "tamaño", "", 9, 12);
		configurarMenu("16", "tamaño", "", 9, 16);
		configurarMenu("20", "tamaño", "", 9, 20);
		configurarMenu("24", "tamaño", "", 9, 24);

		barra.add(fuente);
		barra.add(estilo);
		barra.add(tamagno);

		laminaMenu.add(barra);

		add(laminaMenu, BorderLayout.NORTH);

		area = new JTextPane();
		add(area, BorderLayout.CENTER);

	}

	public void configurarMenu(String rotulo, String menu, String tipoLetra, int estiloLetra, int tamFuente) {

		JMenuItem elemMenu = new JMenuItem(rotulo);

		if (menu == "fuente") {

			fuente.add(elemMenu);

		} else if (menu == "estilo") {

			estilo.add(elemMenu);

		} else if (menu == "tamaño") {

			tamagno.add(elemMenu);

		}

		elemMenu.addActionListener(new GestionaEventos(rotulo, tipoLetra, estiloLetra, tamFuente));

	}

	private class GestionaEventos implements ActionListener {

		String tipoTexto, menu;
		int estiloLetra, tamLetra;

		public GestionaEventos(String menu, String tipoTexto, int estiloLetra, int tamLetra) {

			this.tipoTexto = tipoTexto;
			this.estiloLetra = estiloLetra;
			this.tamLetra = tamLetra;
			this.menu = menu;

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			letras = area.getFont();
			
			if(menu == "Arial" || menu == "Courier" || menu == "Verdana") {
				
				estiloLetra = letras.getStyle();
				tamLetra = letras.getSize();
				
			} else if (menu == "Cursiva" || menu == "Negrita") {
				
				tipoTexto = letras.getFontName();
				tamLetra = letras.getSize();
				
			} else if (menu == "12" || menu == "16" || menu == "20" || menu == "24") {
				
				estiloLetra = letras.getStyle();
				tipoTexto = letras.getFontName();
				
			}
			
			
			area.setFont(new Font(tipoTexto, estiloLetra, tamLetra));

		}

	}

}
