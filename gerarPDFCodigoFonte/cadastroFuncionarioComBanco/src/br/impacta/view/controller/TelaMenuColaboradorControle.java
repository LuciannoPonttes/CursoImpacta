package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.impacta.repository.RepositorioColaborador;
import br.impacta.view.TabelaAlterarColaborador;
import br.impacta.view.TelaCadastroColaborador;
import br.impacta.view.TelaDeletarColaborador;
import br.impacta.view.TelaListarColaborador;

public class TelaMenuColaboradorControle implements ActionListener {
	//recebe do construtor
	JFrame frameMenuInicialColaborador;
	JTextField opcaoMenuColaboradorJTextField;
	TelaCadastroColaborador telaCadastroColaborador = new TelaCadastroColaborador();
	RepositorioColaborador repositorioColaborador;
	TelaListarColaborador telaListarColaborador = new TelaListarColaborador();
	TelaDeletarColaborador telaDeletarColaborador = new TelaDeletarColaborador();
	TabelaAlterarColaborador tabelaAlterarColaborador = new TabelaAlterarColaborador();  
	
	
	
	public TelaMenuColaboradorControle(JFrame frameMenuInicialColaborador, JTextField opcaoMenuColaboradorJTextField,RepositorioColaborador repositorioColaborador) {
		super();
		this.frameMenuInicialColaborador = frameMenuInicialColaborador;
		this.opcaoMenuColaboradorJTextField = opcaoMenuColaboradorJTextField;
		this.repositorioColaborador = repositorioColaborador;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(opcaoMenuColaboradorJTextField.getText().equals("1") || opcaoMenuColaboradorJTextField.getText().equals("2") || opcaoMenuColaboradorJTextField.getText().equals("3")
				|| opcaoMenuColaboradorJTextField.getText().equals("4")||opcaoMenuColaboradorJTextField.getText().equals("5")||opcaoMenuColaboradorJTextField.getText().equals("6")){
			
			frameMenuInicialColaborador.setVisible(false);
			
			switch (opcaoMenuColaboradorJTextField.getText()) {
				case "1":
					telaCadastroColaborador.abrirTelaCadastroColaborador(repositorioColaborador,frameMenuInicialColaborador);
				break;
					
				case "2":
					telaListarColaborador.apresentarListaColaborador(repositorioColaborador.listarColaborador(), frameMenuInicialColaborador);
				break;
				
				case "3":
					telaDeletarColaborador.apresentarDeletarColaborador(repositorioColaborador, frameMenuInicialColaborador);
					
				break;
				
				case "4":
					tabelaAlterarColaborador.apresentarAlterarColaborador(repositorioColaborador, frameMenuInicialColaborador);
				break;
				
				case "5":
					System.out.println("Voltar para o menu inicial");
				break;
				
				case "6":
					System.out.println("Encerrar");
				break;
				
			}
				
		}else {
			
			JOptionPane.showMessageDialog(null, "Digite uma Opcão Valida!!!");
		}
		
	}

}
