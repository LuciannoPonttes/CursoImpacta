package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import br.impacta.model.Gerente;
import br.impacta.repository.RepositorioGerente;

public class TelaAlterarGerenteControle implements ActionListener {
	
	JTextField matriculaTextField;
	JTextField nomeTextField;
	JTextField emailTextField;
	JTextField estadoTextField;
	JTextField cargoTextField;
	JTextField regiaoTextField;
	Gerente gerenteAtual;
	RepositorioGerente repositorioGerente;
	JFrame frameMenuInicialGerente;
	JFrame frameTelaAlterarGerente ;
	
	
	boolean salvo = false;
	
	public TelaAlterarGerenteControle(Gerente gerenteAtual, JTextField nomeTextField,
			JTextField emailTextField, JTextField estadoTextField, JTextField cargoTextField,
			JTextField regiaoTextField, RepositorioGerente repositorioGerente, JFrame frameMenuInicialGerente,
			JFrame frameTelaAlterarGerente ) {
		super();
	
		this.nomeTextField = nomeTextField;
		this.emailTextField = emailTextField;
		this.estadoTextField = estadoTextField;
		this.cargoTextField = cargoTextField;
		this.regiaoTextField = regiaoTextField;
		this.repositorioGerente = repositorioGerente;
		this.frameMenuInicialGerente = frameMenuInicialGerente;
		this.frameTelaAlterarGerente  = frameTelaAlterarGerente ;
		this.gerenteAtual = gerenteAtual;
	}
	
	
	
	

	





	@Override
	public void actionPerformed(ActionEvent e) {
		acionarAlterar();
		frameMenuInicialGerente.setVisible(true);
		frameTelaAlterarGerente.setVisible(false);
		
	}
	
	public void acionarAlterar() {
		Gerente gerenteNovo = new Gerente();
		gerenteNovo.setMatricula(gerenteAtual.getMatricula());
		gerenteNovo.setNome(nomeTextField.getText());
		gerenteNovo.setCargo(cargoTextField.getText());
		gerenteNovo.setEmail(emailTextField.getText());
		gerenteNovo.setEstado(estadoTextField.getText());
		gerenteNovo.setRegiao(regiaoTextField.getText());
		
		
		
		
		salvo = repositorioGerente.alterarGerente(gerenteAtual, gerenteNovo);
		if(salvo) {
			
			JOptionPane.showMessageDialog(null, gerenteNovo.getNome()+ " Foi Alterado!!!" );
				
				
		}else {
			JOptionPane.showMessageDialog(null, "#ERRO# Gerente Não Alterado!!");
		}
			
	}

}
