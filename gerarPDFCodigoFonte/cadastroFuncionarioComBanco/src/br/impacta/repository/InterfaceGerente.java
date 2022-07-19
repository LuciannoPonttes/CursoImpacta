package br.impacta.repository;

import java.util.List;

import br.impacta.model.Gerente;





public interface InterfaceGerente {

	//metodos obrigatorios
	public boolean salvarGerente(Gerente gerente);
	public List<Gerente> listarGerente();
	public boolean deletarGerente(String matricula);
	public Gerente buscarGerente(String matricula);
	public boolean alterarGerente(Gerente gerenteNovo, Gerente gerenteAtual);
	
	
	
	
}
