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
import br.impacta.view.controller.TabelaAlterarGerenteControle;


public class TabelaAlterarGerente {

	public void apresentarAlterarGerente(RepositorioGerente repositorioGerente, JFrame frameMenuInicialGerente) {
		
		
		
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
		
		
		JFrame frameAlterarGerente = new JFrame();
		frameAlterarGerente.setSize(500,600);
		
		
		
		
		JTable tabelaGerente = new JTable(tabelaString, colunasTitulos);
		tabelaGerente.setBounds(30, 40, 300, 300);
		
		JScrollPane scrollPaneAlterarrGerente = new JScrollPane(tabelaGerente);
		JPanel panelAlterarGerente = new JPanel();
		
		JLabel matriculaLabel = new JLabel("Digite a Matricula para Alterar:");
		panelAlterarGerente.add(matriculaLabel);
		
		JTextField matriculaField = new JTextField(10);
		panelAlterarGerente.add(matriculaField);
		
		
		panelAlterarGerente.add(scrollPaneAlterarrGerente);
		
		JButton buttonAlterarGerente = new JButton("Buscar Gerente");
		panelAlterarGerente.add(buttonAlterarGerente);
	
		frameAlterarGerente.add(panelAlterarGerente);
		frameAlterarGerente.setVisible(true);
		
		TabelaAlterarGerenteControle telaAlterarGerenteControle = new TabelaAlterarGerenteControle(repositorioGerente, frameMenuInicialGerente, frameAlterarGerente, matriculaField);
		buttonAlterarGerente.addActionListener(telaAlterarGerenteControle);
	}
	
	
	
}
