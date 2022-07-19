package br.impacta.view;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.impacta.model.Colaborador;
import br.impacta.view.controller.TelaListarColaboradorControle;

public class TelaListarColaborador {
public void apresentarListaColaborador(List<Colaborador> listaDeColaboradores, JFrame frameMenuInicialColaborador) {
		
		
		int quantidadeDeLinhas = listaDeColaboradores.size();
		
		String [][] tabelaString = new String[quantidadeDeLinhas][6];
		
		int posicaoLinha = 0;
		int posicaoColuna = 0;
		
		for(Colaborador colaborador:listaDeColaboradores) {
			
			
			tabelaString[posicaoLinha][posicaoColuna] = colaborador.getMatricula();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = colaborador.getNome();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = colaborador.getEmail();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = colaborador.getEstado();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = colaborador.getCargo();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = colaborador.getLoja();
			
			posicaoColuna = 0;
			posicaoLinha++;
		}
		
		String colunasTitulos[] = {"Matricula","Nome","Email","Estado","Cargo","Loja"}; 
		
		
		JFrame frameListarColaborador = new JFrame();
		frameListarColaborador.setSize(500,600);
		
		JTable tabelaColaborador = new JTable(tabelaString, colunasTitulos);
		tabelaColaborador.setBounds(30, 40, 300, 300);
		
		JScrollPane scrollPaneListarColaborador = new JScrollPane(tabelaColaborador);
		JPanel panelListarColaborador = new JPanel();
		
		panelListarColaborador.add(scrollPaneListarColaborador);
		
		JButton buttonListarColaborador = new JButton("Voltar para Menu Colaborador");
		panelListarColaborador.add(buttonListarColaborador);
	
		frameListarColaborador.add(panelListarColaborador);
		frameListarColaborador.setVisible(true);
		
		TelaListarColaboradorControle telaListarColaboradorControle = new TelaListarColaboradorControle(frameMenuInicialColaborador,frameListarColaborador);
		buttonListarColaborador.addActionListener(telaListarColaboradorControle);
	}
	
	
	
}
