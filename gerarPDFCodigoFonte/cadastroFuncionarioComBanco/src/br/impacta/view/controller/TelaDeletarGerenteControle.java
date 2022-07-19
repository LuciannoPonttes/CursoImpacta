package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.impacta.repository.RepositorioGerente;
import br.impacta.view.TelaListarGerente;

public class TelaDeletarGerenteControle implements ActionListener {

	RepositorioGerente repositorioGerente;
	JFrame frameMenuInicialGerente;
	JFrame frameDeletarrGerente;
	JTextField matriculaField;
	
	TelaListarGerente telaListarGerente = new TelaListarGerente();
	
	boolean deletado;
	
	
	public TelaDeletarGerenteControle(RepositorioGerente repositorioGerente, JFrame frameMenuInicialGerente,
			JFrame frameDeletarrGerente, JTextField matriculaField) {
		super();
		this.repositorioGerente = repositorioGerente;
		this.frameMenuInicialGerente = frameMenuInicialGerente;
		this.frameDeletarrGerente = frameDeletarrGerente;
		this.matriculaField = matriculaField;
	}






	@Override
	public void actionPerformed(ActionEvent e) {
		deletado = repositorioGerente.deletarGerente(matriculaField.getText());
		frameDeletarrGerente.setVisible(false);
		telaListarGerente.apresentarListaGerente(repositorioGerente.listarGerente(), frameMenuInicialGerente);
		
		if(deletado) {
			JOptionPane.showMessageDialog(null, "Gerente Deletado");
		
		}else {
			JOptionPane.showMessageDialog(null, "Gerente Não Encontrado");
			
		}
		
	}

}
