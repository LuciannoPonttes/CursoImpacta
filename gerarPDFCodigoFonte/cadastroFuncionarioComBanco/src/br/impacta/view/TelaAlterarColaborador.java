package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.impacta.model.Colaborador;
import br.impacta.repository.RepositorioColaborador;
import br.impacta.view.controller.TelaAlterarColaboradorControle;


public class TelaAlterarColaborador {

	
	public void abrirTelaAlterarColaborador(Colaborador ColaboradorAtual, RepositorioColaborador repositorioColaborador,JFrame frameMenuInicialColaborador) {
		
		String matriculaTexto = "Digite a matricula do Colaborador:";
		String nomeTexto = "Digite o Nome do Colaborador:";
		String emailTexto = "Digite o Email do Colaborador:";
		String estadoTexto = "Digite o Estado  Colaborador:";
		String cargoTexto = "Digite o Cargo  Colaborador:";
		String lojaTexto = "Digite a loja  Colaborador:";
		
		JFrame frameTelaAlterarColaborador = new JFrame();
		frameTelaAlterarColaborador.setSize(200, 400);
		frameTelaAlterarColaborador.setTitle("Alterar de Colaboradores");
		frameTelaAlterarColaborador.setLocation(300,300);
		
		JPanel panelTelaAlterarColaborador = new JPanel();
		
		
		/*
		JLabel '' = new JLabel('');
		panelTelaAlterarColaborador.add('');
		
		JTextField ''= new JTextField(10);
		panelTelaAlterarColaborador.add('');
		*
		*
		*/
		
		// opcao1
		JLabel matriculaTextoLabel = new JLabel(matriculaTexto);
		panelTelaAlterarColaborador.add(matriculaTextoLabel);
		
		JTextField matriculaTextField = new JTextField(10);
		matriculaTextField.setText(ColaboradorAtual.getMatricula());
		panelTelaAlterarColaborador.add(matriculaTextField);
		
		//opcao2
		JLabel nomeTextoLabel = new JLabel(nomeTexto);
		panelTelaAlterarColaborador.add(nomeTextoLabel);
		
		JTextField nomeTextField = new JTextField(10);
		nomeTextField.setText(ColaboradorAtual.getNome());
		panelTelaAlterarColaborador.add(nomeTextField);
		
		//opcao3
		JLabel emailTextLabel = new JLabel(emailTexto);
		panelTelaAlterarColaborador.add(emailTextLabel);
		
		JTextField emailTextField = new JTextField(10);
		emailTextField.setText(ColaboradorAtual.getEmail());
		panelTelaAlterarColaborador.add(emailTextField);
		
		//opcao4
		JLabel estadoTextLabel = new JLabel(estadoTexto);
		panelTelaAlterarColaborador.add(estadoTextLabel);
		
		JTextField estadoTextField = new JTextField(10);
		estadoTextField.setText(ColaboradorAtual.getEstado());
		panelTelaAlterarColaborador.add(estadoTextField);
		
		//opcao5
		JLabel cargoTextLabel = new JLabel(cargoTexto);
		panelTelaAlterarColaborador.add(cargoTextLabel);
		
		JTextField cargoTextField = new JTextField(10);
		cargoTextField.setText(ColaboradorAtual.getCargo());
		panelTelaAlterarColaborador.add(cargoTextField);
		
		//opcao6
		JLabel lojaTextLabel = new JLabel(lojaTexto);
		panelTelaAlterarColaborador.add(lojaTextLabel);
				
		JTextField lojaTextField = new JTextField(10);
		lojaTextField.setText(ColaboradorAtual.getLoja());
		panelTelaAlterarColaborador.add(lojaTextField);
		
		
		JButton buttonAlterarColaborador = new JButton("Alterar Colaborador");
		panelTelaAlterarColaborador.add(buttonAlterarColaborador);
		
		frameTelaAlterarColaborador.add(panelTelaAlterarColaborador);
		
		frameTelaAlterarColaborador.setVisible(true);
		
		
		TelaAlterarColaboradorControle telaAlterarColaboradorControle = new TelaAlterarColaboradorControle(
				ColaboradorAtual, matriculaTextField, nomeTextField, emailTextField,
				estadoTextField, cargoTextField, lojaTextField, repositorioColaborador,
				frameMenuInicialColaborador, frameTelaAlterarColaborador );
		
		buttonAlterarColaborador.addActionListener(telaAlterarColaboradorControle);
		
	
	}
	
	
}
