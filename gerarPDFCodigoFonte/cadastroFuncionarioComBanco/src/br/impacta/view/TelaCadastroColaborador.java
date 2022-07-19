package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import br.impacta.repository.RepositorioColaborador;
import br.impacta.view.controller.TelaCadastroColaboradorControle;

public class TelaCadastroColaborador {
	
public void abrirTelaCadastroColaborador(RepositorioColaborador repositorioColaborador,JFrame frameMenuInicialColaborador) {
		
		String matriculaTexto = "Digite a matricula do Colaborador:";
		String nomeTexto = "Digite o Nome do Colaborador:";
		String emailTexto = "Digite o Email do Colaborador:";
		String estadoTexto = "Digite o Estado do Colaborador:";
		String cargoTexto = "Digite o Cargo do Colaborador:";
		String lojaTexto = "Digite a Loja do Colaborador:";
		
		JFrame frameTelaCadastroColaborador = new JFrame();
		frameTelaCadastroColaborador.setSize(200, 400);
		frameTelaCadastroColaborador.setTitle("Cadastro de Colaboradores");
		frameTelaCadastroColaborador.setLocation(300,300);
		
		JPanel panelTelaCadastroColaborador = new JPanel();
		
		
		// opcao1
		JLabel matriculaTextoLabel = new JLabel(matriculaTexto);
		panelTelaCadastroColaborador.add(matriculaTextoLabel);
		
		JTextField matriculaTextField = new JTextField(10);
		panelTelaCadastroColaborador.add(matriculaTextField);
		
		//opcao2
		JLabel nomeTextoLabel = new JLabel(nomeTexto);
		panelTelaCadastroColaborador.add(nomeTextoLabel);
		
		JTextField nomeTextField = new JTextField(10);
		panelTelaCadastroColaborador.add(nomeTextField);
		
		//opcao3
		JLabel emailTextLabel = new JLabel(emailTexto);
		panelTelaCadastroColaborador.add(emailTextLabel);
		
		JTextField emailTextField = new JTextField(10);
		panelTelaCadastroColaborador.add(emailTextField);
		
		//opcao4
		JLabel estadoTextLabel = new JLabel(estadoTexto);
		panelTelaCadastroColaborador.add(estadoTextLabel);
		
		JTextField estadoTextField = new JTextField(10);
		panelTelaCadastroColaborador.add(estadoTextField);
		
		//opcao5
		JLabel cargoTextLabel = new JLabel(cargoTexto);
		panelTelaCadastroColaborador.add(cargoTextLabel);
		
		JTextField cargoTextField = new JTextField(10);
		panelTelaCadastroColaborador.add(cargoTextField);
		
		//opcao6
		JLabel lojaTextLabel = new JLabel(lojaTexto);
		panelTelaCadastroColaborador.add(lojaTextLabel);
				
		JTextField lojaTextField = new JTextField(10);
		panelTelaCadastroColaborador.add(lojaTextField);
		
		
		JButton buttonCadastroColaborador = new JButton("Registrar");
		panelTelaCadastroColaborador.add(buttonCadastroColaborador);
		
		frameTelaCadastroColaborador.add(panelTelaCadastroColaborador);
		
		frameTelaCadastroColaborador.setVisible(true);
		
		TelaCadastroColaboradorControle telaCadastroColaboradorControle = new TelaCadastroColaboradorControle(
				matriculaTextField, nomeTextField, emailTextField,
				estadoTextField, cargoTextField, lojaTextField, repositorioColaborador,
				frameMenuInicialColaborador, frameTelaCadastroColaborador);
		
		buttonCadastroColaborador.addActionListener(telaCadastroColaboradorControle);
		
		
		
		
	}

}