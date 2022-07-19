package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.impacta.repository.RepositorioGerente;
import br.impacta.view.controller.TelaMenuGerenteControle;



public class TelaMenuGerente {

	public void apresentarMenuGerente(RepositorioGerente repositorioGerente) {
		
		String menuInicialTexto = "##Menu Inicial Gerente##";
		String opcaoUmMenuTexto = "[1] Cadastrar Gerente";
		String opcaoDoisMenuTexto = "[2] Listar Gerente    ";
		String opcaoTresMenuTexto = "[3] Deletar     ";
		String opcaoQuatroMenuTexto = "[4] Alterar Gerente ";
		String opcaoCincoMenuTexto = "[5] Voltar Menu Inicial ";
		String opcaoSeisMenuTexto = "[6] Gerar PDF        ";
		String opcaoSeteMenuTexto = "[7] Encerrar     ";
		
		JFrame frameMenuInicialGerente = new JFrame();
		frameMenuInicialGerente.setSize(200, 350);
		frameMenuInicialGerente.setTitle("Cadastro de Gerentes");
		frameMenuInicialGerente.setLocation(300,300);
		
		JPanel panelMenuInicial = new JPanel();
		
		JLabel menuInicialLabel = new JLabel(menuInicialTexto);
		panelMenuInicial.add(menuInicialLabel);
		
		JLabel opcaoUmMenuLabel = new JLabel(opcaoUmMenuTexto);
		panelMenuInicial.add(opcaoUmMenuLabel);
		
		JLabel opcaoDoisMenuLabel = new JLabel(opcaoDoisMenuTexto);
		panelMenuInicial.add(opcaoDoisMenuLabel);
		
		JLabel opcaoTresMenuLabel = new JLabel(opcaoTresMenuTexto);
		panelMenuInicial.add(opcaoTresMenuLabel);
		
		JLabel opcaoQuatroMenuLabel = new JLabel(opcaoQuatroMenuTexto);
		panelMenuInicial.add(opcaoQuatroMenuLabel);
		
		JLabel opcaoCincoMenuLabel = new JLabel(opcaoCincoMenuTexto);
		panelMenuInicial.add(opcaoCincoMenuLabel);
		
		JLabel opcaoSeisMenuLabel = new JLabel(opcaoSeisMenuTexto);
		panelMenuInicial.add(opcaoSeisMenuLabel);
		
		JLabel opcaoSeteMenuLabel = new JLabel(opcaoSeteMenuTexto);
		panelMenuInicial.add(opcaoSeteMenuLabel);
		
		JTextField opcaoMenuGerenteJTextField  = new JTextField(10);
		
		panelMenuInicial.add(opcaoMenuGerenteJTextField);
		
		JButton buttonMenu = new JButton("Enviar");
		
		panelMenuInicial.add(buttonMenu);
		
		frameMenuInicialGerente.add(panelMenuInicial);
		
		frameMenuInicialGerente.setVisible(true);

		TelaMenuGerenteControle telaMenuGerenteControle = new TelaMenuGerenteControle(frameMenuInicialGerente,opcaoMenuGerenteJTextField, repositorioGerente);
		buttonMenu.addActionListener(telaMenuGerenteControle);
		
		
		
	
	}
	
}
