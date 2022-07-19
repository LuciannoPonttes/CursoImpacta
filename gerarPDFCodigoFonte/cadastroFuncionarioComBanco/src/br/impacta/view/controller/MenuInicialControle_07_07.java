package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.impacta.repository.RepositorioColaborador;
import br.impacta.repository.RepositorioGerente;
import br.impacta.view.TelaMenuColaborador;
import br.impacta.view.TelaMenuGerente;

public class MenuInicialControle_07_07 implements ActionListener {

	//Recebe da classe tela MenuInicial_07_07
	JTextField	opcaoMenuJTextField;
	JFrame  frameMenuInicial;
	
	//Variaveis criadas aqui - Local
	RepositorioGerente repositorioGerente = new RepositorioGerente();
	TelaMenuGerente telaMenuGerente = new TelaMenuGerente();
	RepositorioColaborador repositorioColaborador = new RepositorioColaborador();
	TelaMenuColaborador telaMenuColaborador = new TelaMenuColaborador();
	
	
	


	public MenuInicialControle_07_07(JTextField opcaoMenuJTextField, JFrame frameMenuInicial) {
		//super();
		this.opcaoMenuJTextField = opcaoMenuJTextField;
		this.frameMenuInicial = frameMenuInicial;
	}
	
	
	//Ação do botão
	@Override
	public void actionPerformed(ActionEvent e) {
		if(opcaoMenuJTextField.getText().equals("1") || opcaoMenuJTextField.getText().equals("2") || opcaoMenuJTextField.getText().equals("3")){
			frameMenuInicial.setVisible(false);
		
			switch (opcaoMenuJTextField.getText()) {
				case "1":
					telaMenuGerente.apresentarMenuGerente(repositorioGerente);
				break;
				
				case "2":
					telaMenuColaborador.apresentarMenuColaborador(repositorioColaborador);
				break;
				
				case "3":
					System.exit(0);
				break;
				
			}
				
		}else {
			
			JOptionPane.showMessageDialog(null, "Digite uma Opcão Valida!!!");
		}
		
				
		
	}
	
}
