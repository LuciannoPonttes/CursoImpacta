package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.impacta.model.Colaborador;
import br.impacta.repository.RepositorioColaborador;
import br.impacta.view.service.ValidaColaborador;



public class TelaCadastroColaboradorControle implements ActionListener {

	JTextField matriculaTextField;
	JTextField nomeTextField;
	JTextField emailTextField;
	JTextField estadoTextField;
	JTextField cargoTextField;
	JTextField lojaTextField;
	RepositorioColaborador repositorioColaborador;
	JFrame frameMenuInicialColaborador;
	JFrame frameTelaCadastroColaborador;
	String mensagemErro = null;
	
	//fora do construtor
	boolean salvo;

	public TelaCadastroColaboradorControle(JTextField matriculaTextField, JTextField nomeTextField,
			JTextField emailTextField, JTextField estadoTextField, JTextField cargoTextField,
			JTextField lojaTextField,RepositorioColaborador repositorioColaborador,JFrame frameMenuInicialColaborador,
			JFrame frameTelaCadastroColaborador) {
		super();
		this.matriculaTextField = matriculaTextField;
		this.nomeTextField = nomeTextField;
		this.emailTextField = emailTextField;
		this.estadoTextField = estadoTextField;
		this.cargoTextField = cargoTextField;
		this.lojaTextField = lojaTextField;
		this.repositorioColaborador = repositorioColaborador;
		this.frameMenuInicialColaborador = frameMenuInicialColaborador;
		this.frameTelaCadastroColaborador = frameTelaCadastroColaborador;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(acionarSalvar() == null) {
			frameMenuInicialColaborador.setVisible(true);
			frameTelaCadastroColaborador.setVisible(false);
		}
		
	}

	public String acionarSalvar() {
		Colaborador Colaborador = new Colaborador();
		ValidaColaborador validaColaborador = new ValidaColaborador();
		Colaborador.setMatricula(matriculaTextField.getText());;
		Colaborador.setNome(nomeTextField.getText());
		Colaborador.setEmail(emailTextField.getText());
		Colaborador.setEstado(estadoTextField.getText());
		Colaborador.setCargo(cargoTextField.getText());
		Colaborador.setLoja(lojaTextField.getText());
		
		mensagemErro = validaColaborador.validarColaborador(Colaborador, repositorioColaborador);
		
		if(mensagemErro == null) {
			salvo = repositorioColaborador.salvarColaborador(Colaborador);
			if(salvo) {
				
					JOptionPane.showMessageDialog(null, Colaborador.getNome()+ " Foi Registrado" );
					return mensagemErro;
					
				}else {
					JOptionPane.showMessageDialog(null, Colaborador.getNome()+ "Erro!!" );
				}
		}else {
			JOptionPane.showMessageDialog(null,mensagemErro);
		}
		return mensagemErro;
	}
	
	
}
