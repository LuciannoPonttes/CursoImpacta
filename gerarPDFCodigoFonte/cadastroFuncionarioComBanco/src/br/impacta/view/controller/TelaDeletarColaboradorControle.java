package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import br.impacta.repository.RepositorioColaborador;

public class TelaDeletarColaboradorControle implements ActionListener {
	
	RepositorioColaborador repositorioColaborador;
	JFrame frameMenuInicialColaborador;
	JFrame frameDeletarColaborador;
	JTextField matriculaField;
	
	boolean deletado;

	public TelaDeletarColaboradorControle(RepositorioColaborador repositorioColaborador, JFrame frameMenuInicialColaborador,
			JFrame frameDeletarColaborador, JTextField matriculaField) {
		super();
		this.repositorioColaborador = repositorioColaborador;
		this.frameMenuInicialColaborador = frameMenuInicialColaborador;
		this.frameDeletarColaborador = frameDeletarColaborador;
		this.matriculaField = matriculaField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		deletado = repositorioColaborador.deletarColaborador(matriculaField.getText());
		frameDeletarColaborador.setVisible(false);
		frameMenuInicialColaborador.setVisible(true);
		
		if(deletado) {
			JOptionPane.showMessageDialog(null, "Colaborador Deletado");
		
		}else {
			JOptionPane.showMessageDialog(null, "Colaborador Não Encontrado");
			
		}
		
	}


	


}
