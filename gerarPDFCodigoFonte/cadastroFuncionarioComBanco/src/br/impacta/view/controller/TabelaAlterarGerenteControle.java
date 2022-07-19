package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.impacta.model.Gerente;
import br.impacta.repository.RepositorioGerente;
import br.impacta.view.TelaAlterarGerente;

public class TabelaAlterarGerenteControle implements ActionListener {
	
	RepositorioGerente repositorioGerente;
	JFrame frameMenuInicialGerente;
	JFrame frameAlterarGerente;
	JTextField matriculaField;
	Gerente gerenteAtual = new Gerente();
	TelaAlterarGerente telalterarGerente =  new TelaAlterarGerente();
	
	
	
	public TabelaAlterarGerenteControle(RepositorioGerente repositorioGerente, JFrame frameMenuInicialGerente,
			JFrame frameAlterarGerente, JTextField matriculaField) {
		super();
		this.repositorioGerente = repositorioGerente;
		this.frameMenuInicialGerente = frameMenuInicialGerente;
		this.frameAlterarGerente = frameAlterarGerente;
		this.matriculaField = matriculaField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		gerenteAtual = repositorioGerente.buscarGerente(matriculaField.getText());
		frameAlterarGerente.setVisible(false);
		if(gerenteAtual != null) {
			telalterarGerente.abrirTelaAlterarGerente(gerenteAtual, repositorioGerente, frameMenuInicialGerente);
			
			
			
		}else {
			JOptionPane.showMessageDialog(null, "Gerente Não encontrado");
			frameMenuInicialGerente.setVisible(true);
		}
		
	}
	
	
	
}
