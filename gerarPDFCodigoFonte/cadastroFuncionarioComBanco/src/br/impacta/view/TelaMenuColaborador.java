package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import br.impacta.repository.RepositorioColaborador;
import br.impacta.view.controller.TelaMenuColaboradorControle;



public class TelaMenuColaborador {

	public void apresentarMenuColaborador(RepositorioColaborador repositorioColaborador) {
		
		String menuInicialTexto = "##Menu Inicial Colaborador##";
		String opcaoUmMenuTexto = "[1] Cadastrar Colaborador";
		String opcaoDoisMenuTexto = "[2] Listar Colaborador    ";
		String opcaoTresMenuTexto = "[3] Deletar";
		String opcaoQuatroMenuTexto = "[4] Alterar Colaborador ";
		String opcaoCincoMenuTexto = "[5] Voltar Menu Inicial ";
		String opcaoSeisMenuTexto = "[6] Encerrar";
		
		JFrame frameMenuInicialColaborador = new JFrame();
		frameMenuInicialColaborador.setSize(200, 250);
		frameMenuInicialColaborador.setTitle("Cadastro de Colaboradores");
		frameMenuInicialColaborador.setLocation(300,300);
		
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
		
		JTextField opcaoMenuColaboradorJTextField  = new JTextField(10);
		
		panelMenuInicial.add(opcaoMenuColaboradorJTextField);
		
		JButton buttonMenu = new JButton("Enviar");
		
		panelMenuInicial.add(buttonMenu);
		
		frameMenuInicialColaborador.add(panelMenuInicial);
		
		frameMenuInicialColaborador.setVisible(true);

		TelaMenuColaboradorControle telaMenuColaboradorControle = new TelaMenuColaboradorControle(frameMenuInicialColaborador,opcaoMenuColaboradorJTextField, repositorioColaborador);
		buttonMenu.addActionListener(telaMenuColaboradorControle);
		
		
		
	
	}
	
}
