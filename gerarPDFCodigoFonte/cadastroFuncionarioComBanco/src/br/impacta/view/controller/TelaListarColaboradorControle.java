package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class TelaListarColaboradorControle implements ActionListener {
	JFrame frameMenuInicialColaborador;
	JFrame frameListarColaborador;

	

	public TelaListarColaboradorControle(JFrame frameMenuInicialColaborador, JFrame frameListarColaborador) {
		super();
		this.frameMenuInicialColaborador = frameMenuInicialColaborador;
		this.frameListarColaborador = frameListarColaborador;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		frameMenuInicialColaborador.setVisible(true);
		frameListarColaborador.setVisible(false);
		
	}

}
