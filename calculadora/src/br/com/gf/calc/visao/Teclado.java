package br.com.gf.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.gf.calc.modelo.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {

	
	private Color COR_CINZA_ESCURO = new Color(68,68,68);
	private Color COR_CINZA_CLARO = new Color(99,99,99);
	private Color COR_LARANJA = new Color(252,163,60);

	
	
	public Teclado() {
	
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		
		setLayout(layout);
		
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		
		//Linha 1
		c.gridwidth=2;
		adcionarBotao("AC",COR_CINZA_ESCURO,c,0,0);
//		adcionarBotao("+-",COR_CINZA_ESCURO,c,1,0);
	//	adcionarBotao("%",COR_CINZA_ESCURO,c,2,0);
		c.gridwidth =1;
		adcionarBotao("±",COR_CINZA_ESCURO,c,2,0);
		adcionarBotao("/",COR_LARANJA,c,3,0);
		
		//Linha 2 
		adcionarBotao("7",COR_CINZA_CLARO,c,0,1);
		adcionarBotao("8",COR_CINZA_CLARO,c,1,1);
		adcionarBotao("9",COR_CINZA_CLARO,c,2,1);
		adcionarBotao("*",COR_LARANJA,c,3,1);
		//Linha 3
		adcionarBotao("4",COR_CINZA_ESCURO,c,0,2);
		adcionarBotao("5",COR_CINZA_ESCURO,c,1,2);
		adcionarBotao("6",COR_CINZA_ESCURO,c,2,2);
		adcionarBotao("-",COR_LARANJA,c,3,2);
		//Linha 4
		adcionarBotao("1",COR_CINZA_ESCURO,c,0,3);
		adcionarBotao("2",COR_CINZA_ESCURO,c,1,3);
		adcionarBotao("3",COR_CINZA_ESCURO,c,2,3);
		adcionarBotao("+",COR_LARANJA,c,3,3);
		//Linha 5
		c.gridwidth =2;
		adcionarBotao("0",COR_CINZA_ESCURO,c,0,4);
		c.gridwidth =1;
		adcionarBotao(",",COR_CINZA_ESCURO,c,2,4);
		adcionarBotao("=",COR_LARANJA,c,3,4);
		
		
					}



	private void adcionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		
		c.gridx = x;
		c.gridy =y;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao,c);
		
	}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() instanceof JButton) {
	JButton botao = (JButton)e.getSource();
	Memoria.getInstancia().processarComando(botao.getText());
	}
}
}
