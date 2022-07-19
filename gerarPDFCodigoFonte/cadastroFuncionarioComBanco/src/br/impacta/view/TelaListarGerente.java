package br.impacta.view;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


import br.impacta.model.Gerente;
import br.impacta.view.controller.TelaListarGerenteControle;

public class TelaListarGerente {

	public void apresentarListaGerente(List<Gerente> listaDeGerentes, JFrame frameMenuInicialGerente) {
		
		
		int quantidadeDeLinhas = listaDeGerentes.size();
		
		String [][] tabelaString = new String[quantidadeDeLinhas][7];
		
		int posicaoLinha = 0;
		int posicaoColuna = 0;
		
		for(Gerente gerente:listaDeGerentes ) {
			
			
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
		
		String colunasTitulos[] = {"Matricula","Nome","Email","Estado","Cargo","Regiao","Salario"}; 
		
		
		JFrame frameListarGerente = new JFrame();
		frameListarGerente.setSize(500,600);
		
		JTable tabelaGerente = new JTable(tabelaString, colunasTitulos);
		tabelaGerente.setBounds(30, 40, 300, 300);
		
		JScrollPane scrollPaneListarGerente = new JScrollPane(tabelaGerente);
		JPanel panelListarGerente = new JPanel();
		
		panelListarGerente.add(scrollPaneListarGerente);
		
		JButton buttonListarGerente = new JButton("Voltar para Menu Gerente");
		panelListarGerente.add(buttonListarGerente);
	
		frameListarGerente.add(panelListarGerente);
		frameListarGerente.setVisible(true);
		
		TelaListarGerenteControle telaListarGerenteControle = new TelaListarGerenteControle(frameMenuInicialGerente,frameListarGerente);
		buttonListarGerente.addActionListener(telaListarGerenteControle);
	}
	
	
	
}
