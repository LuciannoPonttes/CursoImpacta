package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import br.impacta.model.Colaborador;
import br.impacta.repository.RepositorioColaborador;

public class TelaAlterarColaboradorControle implements ActionListener {
	
	JTextField matriculaTextField;
	JTextField nomeTextField;
	JTextField emailTextField;
	JTextField estadoTextField;
	JTextField cargoTextField;
	JTextField lojaTextField;
	Colaborador ColaboradorAtual;
	RepositorioColaborador repositorioColaborador;
	JFrame frameMenuInicialColaborador;
	JFrame frameTelaAlterarColaborador ;
	
	
	boolean salvo = false;
	
	public TelaAlterarColaboradorControle(Colaborador ColaboradorAtual, JTextField matriculaTextField, JTextField nomeTextField,
			JTextField emailTextField, JTextField estadoTextField, JTextField cargoTextField,
			JTextField lojaTextField, RepositorioColaborador repositorioColaborador, JFrame frameMenuInicialColaborador,
			JFrame frameTelaAlterarColaborador ) {
		super();
		this.matriculaTextField = matriculaTextField;
		this.nomeTextField = nomeTextField;
		this.emailTextField = emailTextField;
		this.estadoTextField = estadoTextField;
		this.cargoTextField = cargoTextField;
		this.lojaTextField = lojaTextField;
		this.repositorioColaborador = repositorioColaborador;
		this.frameMenuInicialColaborador = frameMenuInicialColaborador;
		this.frameTelaAlterarColaborador  = frameTelaAlterarColaborador ;
		this.ColaboradorAtual = ColaboradorAtual;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		acionarAlterar();
		frameMenuInicialColaborador.setVisible(true);
		frameTelaAlterarColaborador.setVisible(false);
		
	}
	
	public void acionarAlterar() {
		Colaborador ColaboradorNovo = new Colaborador();
		ColaboradorNovo.setMatricula(matriculaTextField.getText());
		ColaboradorNovo.setNome(nomeTextField.getText());
		ColaboradorNovo.setCargo(cargoTextField.getText());
		ColaboradorNovo.setEmail(emailTextField.getText());
		ColaboradorNovo.setEstado(estadoTextField.getText());
		ColaboradorNovo.setLoja(lojaTextField.getText());
		
		
		
		
		salvo = repositorioColaborador.alterarColaborador(ColaboradorAtual, ColaboradorNovo);
		if(salvo) {
			
			JOptionPane.showMessageDialog(null, ColaboradorNovo.getNome()+ " Foi Alterado!!!" );
				
				
		}else {
			JOptionPane.showMessageDialog(null, "#ERRO# Colaborador Não Alterado!!");
		}
			
	}

}
