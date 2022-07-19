package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.impacta.model.Gerente;
import br.impacta.repository.RepositorioGerente;
import br.impacta.view.controller.TelaAlterarGerenteControle;


public class TelaAlterarGerente {

	
	public void abrirTelaAlterarGerente(Gerente gerenteAtual, RepositorioGerente repositorioGerente,JFrame frameMenuInicialGerente) {
		
		String matriculaTexto = "Digite a matricula do Gerente:";
		String nomeTexto = "Digite o Nome do Gerente:";
		String emailTexto = "Digite o Email do Gerente:";
		String estadoTexto = "Digite o Estado  Gerente:";
		String cargoTexto = "Digite o Cargo  Gerente:";
		String regiaoTexto = "Digite a Regiao  Gerente:";
		
		JFrame frameTelaAlterarGerente = new JFrame();
		frameTelaAlterarGerente.setSize(200, 400);
		frameTelaAlterarGerente.setTitle("Alterar de Gerentees");
		frameTelaAlterarGerente.setLocation(300,300);
		
		JPanel panelTelaAlterarGerente = new JPanel();
		
		
		/*
		JLabel '' = new JLabel('');
		panelTelaAlterarGerente.add('');
		
		JTextField ''= new JTextField(10);
		panelTelaAlterarGerente.add('');
		*
		*
		*/
		
		// opcao1
		
		//opcao2
		JLabel nomeTextoLabel = new JLabel(nomeTexto);
		panelTelaAlterarGerente.add(nomeTextoLabel);
		
		JTextField nomeTextField = new JTextField(10);
		nomeTextField.setText(gerenteAtual.getNome());
		panelTelaAlterarGerente.add(nomeTextField);
		
		//opcao3
		JLabel emailTextLabel = new JLabel(emailTexto);
		panelTelaAlterarGerente.add(emailTextLabel);
		
		JTextField emailTextField = new JTextField(10);
		emailTextField.setText(gerenteAtual.getEmail());
		panelTelaAlterarGerente.add(emailTextField);
		
		//opcao4
		JLabel estadoTextLabel = new JLabel(estadoTexto);
		panelTelaAlterarGerente.add(estadoTextLabel);
		
		JTextField estadoTextField = new JTextField(10);
		estadoTextField.setText(gerenteAtual.getEstado());
		panelTelaAlterarGerente.add(estadoTextField);
		
		//opcao5
		JLabel cargoTextLabel = new JLabel(cargoTexto);
		panelTelaAlterarGerente.add(cargoTextLabel);
		
		JTextField cargoTextField = new JTextField(10);
		cargoTextField.setText(gerenteAtual.getCargo());
		panelTelaAlterarGerente.add(cargoTextField);
		
		//opcao6
		JLabel regiaoTextLabel = new JLabel(regiaoTexto);
		panelTelaAlterarGerente.add(regiaoTextLabel);
				
		JTextField regiaoTextField = new JTextField(10);
		regiaoTextField.setText(gerenteAtual.getRegiao());
		panelTelaAlterarGerente.add(regiaoTextField);
		
		
		JButton buttonAlterarGerente = new JButton("Alterar Gerente");
		panelTelaAlterarGerente.add(buttonAlterarGerente);
		
		frameTelaAlterarGerente.add(panelTelaAlterarGerente);
		
		frameTelaAlterarGerente.setVisible(true);
		
		
		TelaAlterarGerenteControle telaAlterarGerenteControle = new TelaAlterarGerenteControle(
				gerenteAtual, nomeTextField, emailTextField,
				estadoTextField, cargoTextField, regiaoTextField, repositorioGerente,
				frameMenuInicialGerente, frameTelaAlterarGerente );
		
		buttonAlterarGerente.addActionListener(telaAlterarGerenteControle);
		
	
	}
	
	
}
