package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.impacta.repository.RepositorioGerente;
import br.impacta.view.controller.TelaCadastroGerenteControle;



public class TelaCadastroGerente {

	public void abrirTelaCadastroGerente(RepositorioGerente repositorioGerente,JFrame frameMenuInicialGerente) {
		
		//String matriculaTexto = "Digite a matricula do Gerente:";
		String nomeTexto = "Digite o Nome do Gerente:";
		String emailTexto = "Digite o Email do Gerente:";
		String estadoTexto = "Digite o Estado  Gerente:";
		String cargoTexto = "Digite o Cargo  Gerente:";
		String regiaoTexto = "Digite a Regiao  Gerente:";
		String horaTrabalhadaTexto = "Horas Trabalhadas:";
		
		JFrame frameTelaCadastroGerente = new JFrame();
		frameTelaCadastroGerente.setSize(200, 400);
		frameTelaCadastroGerente.setTitle("Cadastro de Gerentees");
		frameTelaCadastroGerente.setLocation(300,300);
		
		JPanel panelTelaCadastroGerente = new JPanel();
		
		
		/*
		JLabel '' = new JLabel('');
		panelTelaCadastroGerente.add('');
		
		JTextField ''= new JTextField(10);
		panelTelaCadastroGerente.add('');
		*
		*
		*/
		
		/* opcao1
		JLabel matriculaTextoLabel = new JLabel(matriculaTexto);
		panelTelaCadastroGerente.add(matriculaTextoLabel);
		
		JTextField matriculaTextField = new JTextField(10);
		panelTelaCadastroGerente.add(matriculaTextField);
		*/
		//opcao2
		JLabel nomeTextoLabel = new JLabel(nomeTexto);
		panelTelaCadastroGerente.add(nomeTextoLabel);
		
		JTextField nomeTextField = new JTextField(10);
		panelTelaCadastroGerente.add(nomeTextField);
		
		//opcao3
		JLabel emailTextLabel = new JLabel(emailTexto);
		panelTelaCadastroGerente.add(emailTextLabel);
		
		JTextField emailTextField = new JTextField(10);
		panelTelaCadastroGerente.add(emailTextField);
		
		//opcao4
		JLabel estadoTextLabel = new JLabel(estadoTexto);
		panelTelaCadastroGerente.add(estadoTextLabel);
		
		JTextField estadoTextField = new JTextField(10);
		panelTelaCadastroGerente.add(estadoTextField);
		
		//opcao5
		JLabel cargoTextLabel = new JLabel(cargoTexto);
		panelTelaCadastroGerente.add(cargoTextLabel);
		
		JTextField cargoTextField = new JTextField(10);
		panelTelaCadastroGerente.add(cargoTextField);
		
		//opcao6
		JLabel regiaoTextLabel = new JLabel(regiaoTexto);
		panelTelaCadastroGerente.add(regiaoTextLabel);
				
		JTextField regiaoTextField = new JTextField(10);
		panelTelaCadastroGerente.add(regiaoTextField);
		
		JLabel horaTrabalhadaLabel = new JLabel(horaTrabalhadaTexto);
		panelTelaCadastroGerente.add(horaTrabalhadaLabel);
				
		JTextField horaTrabalhadaTextField = new JTextField(10);
		panelTelaCadastroGerente.add(horaTrabalhadaTextField);
		
		JButton buttonCadastroGerente = new JButton("Registrar");
		panelTelaCadastroGerente.add(buttonCadastroGerente);
		
		frameTelaCadastroGerente.add(panelTelaCadastroGerente);
		
		frameTelaCadastroGerente.setVisible(true);
		
		TelaCadastroGerenteControle telaCadastroGerenteControle = new TelaCadastroGerenteControle(
				horaTrabalhadaTextField, nomeTextField, emailTextField,
				estadoTextField, cargoTextField, regiaoTextField, repositorioGerente,
				frameMenuInicialGerente, frameTelaCadastroGerente);
		
		buttonCadastroGerente.addActionListener(telaCadastroGerenteControle);
		
		
		
		
	}
}
