package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import br.impacta.model.Colaborador;
import br.impacta.repository.RepositorioColaborador;
import br.impacta.view.controller.TabelaAlterarColaboradorControle;


public class TabelaAlterarColaborador {

	public void apresentarAlterarColaborador(RepositorioColaborador repositorioColaborador, JFrame frameMenuInicialColaborador) {
		
		
		
		int quantidadeDeLinhas = repositorioColaborador.listarColaborador().size();
		
		String [][] tabelaString = new String[quantidadeDeLinhas][6];
		
		int posicaoLinha = 0;
		int posicaoColuna = 0;
		
		for(Colaborador Colaborador:repositorioColaborador.listarColaborador()) {
			
			
			tabelaString[posicaoLinha][posicaoColuna] = Colaborador.getMatricula();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = Colaborador.getNome();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = Colaborador.getEmail();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = Colaborador.getEstado();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = Colaborador.getCargo();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = Colaborador.getLoja();
			
			posicaoColuna = 0;
			posicaoLinha++;
		}
		
		String colunasTitulos[] = {"Matricula","Nome","Email","Estado","Cargo","Regiao"}; 
		
		
		JFrame frameAlterarColaborador = new JFrame();
		frameAlterarColaborador.setSize(500,600);
		
		
		
		
		JTable tabelaColaborador = new JTable(tabelaString, colunasTitulos);
		tabelaColaborador.setBounds(30, 40, 300, 300);
		
		JScrollPane scrollPaneAlterarrColaborador = new JScrollPane(tabelaColaborador);
		JPanel panelAlterarColaborador = new JPanel();
		
		JLabel matriculaLabel = new JLabel("Digite a Matricula para Alterar:");
		panelAlterarColaborador.add(matriculaLabel);
		
		JTextField matriculaField = new JTextField(10);
		panelAlterarColaborador.add(matriculaField);
		
		
		panelAlterarColaborador.add(scrollPaneAlterarrColaborador);
		
		JButton buttonAlterarColaborador = new JButton("Buscar Colaborador");
		panelAlterarColaborador.add(buttonAlterarColaborador);
	
		frameAlterarColaborador.add(panelAlterarColaborador);
		frameAlterarColaborador.setVisible(true);
		
		TabelaAlterarColaboradorControle telaAlterarColaboradorControle = new TabelaAlterarColaboradorControle(repositorioColaborador, frameMenuInicialColaborador, frameAlterarColaborador, matriculaField);
		buttonAlterarColaborador.addActionListener(telaAlterarColaboradorControle);
	}
	
	
	
}
