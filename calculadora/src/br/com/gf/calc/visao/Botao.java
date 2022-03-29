package br.com.gf.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton {
	
	public Botao(String texto, Color cor) {
	setText(texto);
	setOpaque(true);
	setBackground(cor);
	setForeground(Color.white);
	setFont(new Font ("courier",Font.PLAIN,15));
	setBorder(BorderFactory.createLineBorder(Color.black));
		
		
	}

}
