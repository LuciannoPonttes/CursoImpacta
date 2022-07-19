package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class TelaListarGerenteControle implements ActionListener {
	JFrame frameMenuInicialGerente;
	JFrame frameListarGerente;

	

	public TelaListarGerenteControle(JFrame frameMenuInicialGerente, JFrame frameListarGerente) {
		super();
		this.frameMenuInicialGerente = frameMenuInicialGerente;
		this.frameListarGerente = frameListarGerente;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		frameMenuInicialGerente.setVisible(true);
		frameListarGerente.setVisible(false);
		
	}
	
	
	
	
}
