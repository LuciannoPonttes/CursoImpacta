package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.impacta.repository.RepositorioGerente;
import br.impacta.view.TabelaAlterarGerente;
import br.impacta.view.TelaCadastroGerente;
import br.impacta.view.TelaDeletarGerente;
import br.impacta.view.TelaListarGerente;
import br.impacta.view.service.GerarPDF;

public class TelaMenuGerenteControle implements ActionListener {
	//recebe do construtor
	JFrame frameMenuInicialGerente;
	JTextField opcaoMenuGerenteJTextField;
	TelaCadastroGerente telaCadastroGerente = new TelaCadastroGerente();
	RepositorioGerente repositorioGerente;
	TelaListarGerente telaListarGerente = new TelaListarGerente();
	TelaDeletarGerente telaDeletarGerente = new TelaDeletarGerente();
	TabelaAlterarGerente tabelaAlterarGerente = new TabelaAlterarGerente(); 
	
	GerarPDF gerarPDF = new GerarPDF();
	
	
	
	public TelaMenuGerenteControle(JFrame frameMenuInicialGerente, JTextField opcaoMenuGerenteJTextField,RepositorioGerente repositorioGerente) {
		super();
		this.frameMenuInicialGerente = frameMenuInicialGerente;
		this.opcaoMenuGerenteJTextField = opcaoMenuGerenteJTextField;
		this.repositorioGerente = repositorioGerente;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(opcaoMenuGerenteJTextField.getText().equals("1") || opcaoMenuGerenteJTextField.getText().equals("2") || opcaoMenuGerenteJTextField.getText().equals("3")
				|| opcaoMenuGerenteJTextField.getText().equals("4")||opcaoMenuGerenteJTextField.getText().equals("5")||opcaoMenuGerenteJTextField.getText().equals("6")
				||opcaoMenuGerenteJTextField.getText().equals("7")){
			
			frameMenuInicialGerente.setVisible(false);
			
			switch (opcaoMenuGerenteJTextField.getText()) {
				case "1":
					telaCadastroGerente.abrirTelaCadastroGerente(repositorioGerente,frameMenuInicialGerente);
				break;
					
				case "2":
					telaListarGerente.apresentarListaGerente(repositorioGerente.listarGerente(), frameMenuInicialGerente);
				break;
				
				case "3":
					telaDeletarGerente.apresentarDeletarGerente(repositorioGerente, frameMenuInicialGerente);
					
				break;
				
				case "4":
					tabelaAlterarGerente.apresentarAlterarGerente(repositorioGerente, frameMenuInicialGerente);
				break;
				
				case "5":
					System.out.println("Voltar para o menu inicial");
				break;
				
				case "6":
					frameMenuInicialGerente.setVisible(true);
					gerarPDF.gerarPdfGerente();
					
				break;
				
				case "7":
					//System.exit(0);
					System.exit(0);
				break;
			}
				
		}else {
			
			JOptionPane.showMessageDialog(null, "Digite uma Opcão Valida!!!");
		}
		
	}

}
