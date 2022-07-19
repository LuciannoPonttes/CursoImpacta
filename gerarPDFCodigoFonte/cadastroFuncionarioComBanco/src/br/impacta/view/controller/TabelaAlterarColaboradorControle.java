package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.impacta.model.Colaborador;
import br.impacta.repository.RepositorioColaborador;
import br.impacta.view.TelaAlterarColaborador;

public class TabelaAlterarColaboradorControle implements ActionListener {
	
	RepositorioColaborador repositorioColaborador;
	JFrame frameMenuInicialColaborador;
	JFrame frameAlterarColaborador;
	JTextField matriculaField;
	Colaborador ColaboradorAtual = new Colaborador();
	TelaAlterarColaborador telalterarColaborador =  new TelaAlterarColaborador();
	
	
	
	public TabelaAlterarColaboradorControle(RepositorioColaborador repositorioColaborador, JFrame frameMenuInicialColaborador,
			JFrame frameAlterarColaborador, JTextField matriculaField) {
		super();
		this.repositorioColaborador = repositorioColaborador;
		this.frameMenuInicialColaborador = frameMenuInicialColaborador;
		this.frameAlterarColaborador = frameAlterarColaborador;
		this.matriculaField = matriculaField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ColaboradorAtual = repositorioColaborador.buscarColaborador(matriculaField.getText());
		frameAlterarColaborador.setVisible(false);
		if(ColaboradorAtual != null) {
			telalterarColaborador.abrirTelaAlterarColaborador(ColaboradorAtual, repositorioColaborador, frameMenuInicialColaborador);
			
			
			
		}else {
			JOptionPane.showMessageDialog(null, "Colaborador Não encontrado");
			frameMenuInicialColaborador.setVisible(true);
		}
		
	}
	
	
	
}
