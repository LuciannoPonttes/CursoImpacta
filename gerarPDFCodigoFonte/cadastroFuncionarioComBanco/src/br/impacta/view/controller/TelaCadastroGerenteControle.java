package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.impacta.model.Gerente;
import br.impacta.repository.RepositorioGerente;
import br.impacta.view.service.GerarMatricula;
import br.impacta.view.service.ValidaGerente;



public class TelaCadastroGerenteControle implements ActionListener {

	
	JTextField nomeTextField;
	JTextField emailTextField;
	JTextField estadoTextField;
	JTextField cargoTextField;
	JTextField regiaoTextField;
	RepositorioGerente repositorioGerente;
	JFrame frameMenuInicialGerente;
	JFrame frameTelaCadastroGerente;
	String mensagemErro = null;
	JTextField horaTrabalhadaTextField;
	
	
	
	//fora do construtor
	boolean salvo;
	GerarMatricula gerarMatricula = new GerarMatricula();

	public TelaCadastroGerenteControle(JTextField horaTrabalhadaTextField,JTextField nomeTextField,
			JTextField emailTextField, JTextField estadoTextField, JTextField cargoTextField,
			JTextField regiaoTextField,RepositorioGerente repositorioGerente,JFrame frameMenuInicialGerente,
			JFrame frameTelaCadastroGerente) {
		super();
		this.nomeTextField = nomeTextField;
		this.emailTextField = emailTextField;
		this.estadoTextField = estadoTextField;
		this.cargoTextField = cargoTextField;
		this.regiaoTextField = regiaoTextField;
		this.repositorioGerente = repositorioGerente;
		this.frameMenuInicialGerente = frameMenuInicialGerente;
		this.frameTelaCadastroGerente = frameTelaCadastroGerente;
		this.horaTrabalhadaTextField = horaTrabalhadaTextField;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(acionarSalvar() == null) {
			frameMenuInicialGerente.setVisible(true);
			frameTelaCadastroGerente.setVisible(false);
		}
		
	}

	public String acionarSalvar() {
		Gerente gerente = new Gerente();
		ValidaGerente validaGerente = new ValidaGerente();
		gerente.setMatricula(gerarMatricula.gerarMatriculaGerente());
		gerente.setNome(nomeTextField.getText());
		gerente.setEmail(emailTextField.getText());
		gerente.setEstado(estadoTextField.getText());
		gerente.setCargo(cargoTextField.getText());
		gerente.setRegiao(regiaoTextField.getText());
		
		mensagemErro = validaGerente.validarGerente(gerente, repositorioGerente,horaTrabalhadaTextField);
		
		if(mensagemErro == null) {
			gerente.setSalario(gerente.calcularSalario(Integer.parseInt(horaTrabalhadaTextField.getText())));
			
			salvo = repositorioGerente.salvarGerente(gerente);
			if(salvo) {
				
					JOptionPane.showMessageDialog(null, gerente.getNome()+ " Foi Registrado" );
					return mensagemErro;
					
				}else {
					JOptionPane.showMessageDialog(null, gerente.getNome()+ "Erro!!" );
				}
		}else {
			JOptionPane.showMessageDialog(null,mensagemErro);
		}
		return mensagemErro;
	}
	
	
}
