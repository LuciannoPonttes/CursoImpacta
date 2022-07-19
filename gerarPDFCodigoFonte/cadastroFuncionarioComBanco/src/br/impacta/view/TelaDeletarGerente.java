package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import br.impacta.model.Gerente;
import br.impacta.repository.RepositorioGerente;
import br.impacta.view.controller.TelaDeletarGerenteControle;


public class TelaDeletarGerente {
	
	
public void apresentarDeletarGerente(RepositorioGerente repositorioGerente, JFrame frameMenuInicialGerente) {
		
		
		
		int quantidadeDeLinhas = repositorioGerente.listarGerente().size();
		
		String [][] tabelaString = new String[quantidadeDeLinhas][7];
		
		int posicaoLinha = 0;
		int posicaoColuna = 0;
		
		for(Gerente gerente:repositorioGerente.listarGerente()) {
			
			
			tabelaString[posicaoLinha][posicaoColuna] = gerente.getMatricula();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = gerente.getNome();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = gerente.getEmail();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = gerente.getEstado();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = gerente.getCargo();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = gerente.getRegiao();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = String.valueOf(gerente.getSalario());
			
			posicaoColuna = 0;
			posicaoLinha++;
		}
		
		String colunasTitulos[] = {"Matricula","Nome","Email","Estado","Cargo","Regiao", "Salario"}; 
		
		
		JFrame frameDeletarGerente = new JFrame();
		frameDeletarGerente.setSize(500,600);
		
		
		
		
		JTable tabelaGerente = new JTable(tabelaString, colunasTitulos);
		tabelaGerente.setBounds(30, 40, 300, 300);
		
		JScrollPane scrollPaneDeletarrGerente = new JScrollPane(tabelaGerente);
		JPanel panelDeletarGerente = new JPanel();
		
		JLabel matriculaLabel = new JLabel("Digite a Matricula para deletar:");
		panelDeletarGerente.add(matriculaLabel);
		
		JTextField matriculaField = new JTextField(10);
		panelDeletarGerente.add(matriculaField);
		
		
		panelDeletarGerente.add(scrollPaneDeletarrGerente);
		
		JButton buttonDeletarGerente = new JButton("Deletar Gerente");
		panelDeletarGerente.add(buttonDeletarGerente);
	
		frameDeletarGerente.add(panelDeletarGerente);
		frameDeletarGerente.setVisible(true);
		
		TelaDeletarGerenteControle telaDeletarGerenteControle = new TelaDeletarGerenteControle(repositorioGerente, frameMenuInicialGerente, frameDeletarGerente, matriculaField);
		buttonDeletarGerente.addActionListener(telaDeletarGerenteControle);
	}
}
